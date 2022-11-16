/*
Задача 5. Джава-Блэкджэк.
Три участника играют в карты.
Правила карточной игры:
Каждый игрок получает по 2 случайных карты. Каждая карта даёт игроку определённое количество очков:
(в скобках указан номер случайного числа)
(2)двойка - 2 очка
(3)тройка - 3 очка
(4)четвёрка - 4 очка
... и.т.д.
(9)девятка - 9 очков
(10)десятка - 10 очков
(11)валет - 2 очка
(12)дама - 3 очка
(13)король - 4 очка
(14)туз - 11 очков

У каждого участника на счету по 500 долларов.

На каждый раунд каждый игрок ставит по 100 долларов, формируя банк.
После раздачи карт каждому игроку, считается количество очков.
Тот у кого больше всех очков, побеждает и забирает деньги из банка себе.
Если очков поровну у двух или у трёх игроков сразу, то банк делится между ними поровну.

Задача.
Рассчитать баланс каждого участника после нужного числа раундов. Есть особые условия:
1) если игрок выиграл раунд, то он ставит на 33 доллара больше на следующий раунд.
2) если игроку выпали два туза, то два других игрока выплачивают ему по 88 долларов дополнительно.
3) если игроку выпало сочетание валет+дама, валет+король или дама+король, то игрок платит на 25 долларов меньше в следующем раунде.
4) если игроку выпали любые две одинаковые карты, то количество очков за них удваивается.
*/
public class Main {
    public static void main(String[] args) {
        // ЗАДАЁМ ФИКСИРОВАННЫЙ ДИАПАЗОН ПОЛУЧАЕМЫХ СЛУЧАЙНЫХ КАРТ
        final int min = 10; // Минимальное число для диапазона (карта двойки)
        final int max = 14; // Максимальное число для диапазона (карта туза)
        // ОБЪЯВЛЯЕМ ПЕРЕМЕННЫЕ:
        int countPlayers = 3; // количество игроков
        String[] playerName = new String[]{"Brad", "Jim", "Zack"};
        // ниже создаём двумерный массив, в котором будем хранить деньги каждого игрока и размер ставки на раунд
        double[][] playerMoneyAndBet = new double[countPlayers][countPlayers]; // индексы: [0] - это деньги, [1] - это размер ставки на раунд
        for (int i = 0; i < countPlayers; i++) playerMoneyAndBet[0][i] = 500; // выдаём деньги каждому игроку
        for (int i = 0; i < countPlayers; i++) playerMoneyAndBet[1][i] = 100; // задаём стартовый размер ставки для каждого игрока
        int[] extraBet = new int[countPlayers]; // дополнительные размеры ставок (соответствует количеству игроков)
        int[] cardIndex = new int[2]; // индекс карт (соответствует количеству раздаваемых карт для одного игрока)
        int[] points = new int[2]; // очки за карту (соответствует количеству раздаваемых карт для одного игрока)
        int[] totalPoints = new int[countPlayers]; // сумма очков за карты (соответствует количеству игроков)
        String bonusText = ""; // текстовая строка (по умолчанию пустая) для вывода надписей "Удвоение" и "Два туза", если выпали две одинаковые карты

        // ИГРА:
        for (int k = 1; k < 15; k++) { // цикл "раундов игры" (основной цикл с двумя вложенными циклами)
            System.out.println("\n----------Раунд № " + k + " ----------\n"); // номер раунда
            for (int i = 0; i < countPlayers; i++) { // цикл "игрока"
                System.out.println("У " + playerName[i] + " на счету: " + playerMoneyAndBet[0][i] + " $. Его ставка: " + playerMoneyAndBet[1][i] + " $");
                System.out.print(playerName[i] + " получает карты: ");
                for (int j = 0; j < 2; j++) { // цикл "раздачи карт" (всегда 2 итерации, т.к. у нас по правилам выдается по 2 карты)
                    cardIndex[j] = getRandomNumber(min, max); // определение типа(номинала) карты за счёт генератора случайных чисел
                    points[j] = cardDescription(cardIndex[j]); // получение значения очков за карту (из switch-метода)
                    if (j == 0) System.out.print(" и ");
                }
                // ниже пропишем решение условия задачи №3:
                // если игроку выпало сочетание валет+дама, валет+король или дама+король, то игрок платит на 25 $ меньше в следующем раунде.
                // индексы нужных нам карт валет:11, дама:12, король:13
                // необходимо учесть эти пары как для первой карты, так и для второй
                extraBet[i] = 0; // обнуляем бонусный размер ставки (чтобы он не скопировался из предыдущего раунда)
                if ((cardIndex[0] >= 11 && cardIndex[0] <= 13) && (cardIndex[1] >= 11 && cardIndex[1] <= 13)) {
                    if (cardIndex[0] != cardIndex[1]) {
                        extraBet[i] -= 25; // передаем это значение в метод roundResult вместе с остальными данными (ниже)
                    }
                }
                totalPoints[i] = points[0] + points[1]; // подсчет суммы очков за 2 карты (необходимо привязать к индексу игрока[i])
                if (cardIndex[0] == cardIndex[1]) { // сравнение двух выпавших карт
                    totalPoints[i] *= 2; // удвоение очков, в случае одинаковых карт (условие задачи №4)
                    bonusText = " (->>-Удвоение-<<-) ";
                }
                if (cardIndex[0] == 14 && cardIndex[1] == 14) {  // ТУТ ПРОБЛЕМА, НЕ СО ВСЕХ СНИАМЕТ ДЕНЬГИ
                    bonusText = " (-$$$- 2 ТУЗА -$$$-)";
                    for (int r = 0; r < countPlayers; r++) {
                        playerMoneyAndBet[0][r] -= 88;
                        if (r == i) {
                            playerMoneyAndBet[0][i] += countPlayers * 88;
                            bonusText += ". Бонус: " + ((countPlayers - 1) * 88) + " $";
                        }

                        //bonusText += ". Штраф: -88 $";
                        //System.out.println("playerMoneyAndBet[0][r]: " + playerMoneyAndBet[0][r]);
                    }
                }
                System.out.println(". Он набирает " + totalPoints[i] + " очков" + bonusText + "\n");
                bonusText = "";
            }
            // запуск метода на сравнение очков всех игроков (внутри цикла "раундов игры"):
            roundResult(totalPoints, playerMoneyAndBet, playerName, extraBet);
            for (int n = 0; n < countPlayers; n++) {

            }
        }
    }

    public static void roundResult(int points[], double moneyAndBets[][], String name[], int extraBet[]) {
        double standardBet = 100;
        boolean[] winners = new boolean[points.length]; // отдельный массив куда будем записывать индексы победителей в раунде
        int winnersCounter = 0; // число победителей в раунде
        double potBet = 0; // общий банк на раунд (сумма ставок всех игроков)
        int max = points[0];
        for (int i = 0; i < points.length; i++) { // определяем максимальное количество очков в раунде
            potBet += moneyAndBets[1][i]; // добавляем в банк размеры ставок каждого игрока (индекс [1], перед if )
            moneyAndBets[0][i] -= moneyAndBets[1][i]; // забираем со счёта игроков, размеры их ставок (индекс [0] - индекс [1])
            moneyAndBets[1][i] = standardBet; // устанавливаем для ставки игрока стандартное значение
            if (points[i] > max) {
                max = points[i];
            }
        }
        for (int i = 0; i < points.length; i++) { // учитываем случаи, когда несколько игроков набрали поровну очков
            if (points[i] == max) {               // и при этом - это максимальное значение очков в раунде
                winners[i] = true;                // вносим победителей в отдельный массив (у индексов проигравших игроков будет по умолчанию false)
                winnersCounter++;                 // и мы легко их отсеим от победителей при расчёте выигрыша)
                if (winnersCounter == 1) {
                    System.out.print(name[i] + " ");
                } else {
                    System.out.print("и " + name[i] + " ");
                }
            }
        }
        potBet /= winnersCounter; // делим и считаем выигрыш на каждого победителя (если их несколько)
        if (winnersCounter > 1) {
            System.out.println("побеждают и каждый получает по " + potBet + " $");
        } else {
            System.out.println("побеждает и получает " + potBet + " $");
        }
        // Ниже раскрывается удобство двумерных массивов. Мы можем оперировать двумя наборами(массивами) различных данных и возвращать их из метода
        for (int i = 0; i < points.length; i++) {
            if (winners[i] == true) { // условие тут: все кто "попал" в массив победителей из предыдущего цикла:
                moneyAndBets[0][i] += potBet; // получают выигрыш себе на счёт (индекс [0])
                extraBet[i] += 33;     // а также их ставка (индекс [1]) на следующий раунд увеличивается на 33 $ (условие задачи № 1)
            }
            moneyAndBets[1][i] += extraBet[i]; // корректируем размер ставки с учетом бонусов/штрафов
            // System.out.println("extraBet " + extraBet[i]); // контроль бонуса ставки (удалить)
        }
        //return moneyAndBets;
    }

    // Метод получения псевдослучайного целого числа от min до max (включая max);
    public static int getRandomNumber(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    //метод на вывод полученной карты и очков за неё
    public static int cardDescription(int card) {
        int points = 0;
        switch (card) {
            case 2:
                System.out.print("\"двойка\"");
                points = 2;
                break;
            case 3:
                System.out.print("\"тройка\"");
                points = 3;
                break;
            case 4:
                System.out.print("\"четвёрка\"");
                points = 4;
                break;
            case 5:
                System.out.print("\"пятёрка\"");
                points = 5;
                break;
            case 6:
                System.out.print("\"шестёрка\"");
                points = 6;
                break;
            case 7:
                System.out.print("\"семёрка\"");
                points = 7;
                break;
            case 8:
                System.out.print("\"восьмёрка\"");
                points = 8;
                break;
            case 9:
                System.out.print("\"девятка\"");
                points = 9;
                break;
            case 10:
                System.out.print("\"десятка\"");
                points = 10;
                break;
            case 11:
                System.out.print("\"валет\"");
                points = 2;
                break;
            case 12:
                System.out.print("\"дама\"");
                points = 3;
                break;
            case 13:
                System.out.print("\"король\"");
                points = 4;
                break;
            case 14:
                System.out.print("\"туз\"");
                points = 11;
                break;
        }
        return points; // возвращаем количество очков за карту
    }
}


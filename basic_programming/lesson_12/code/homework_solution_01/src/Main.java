public class Main {
    public static void main(String[] args) {
//        Создайте массив нечетных чисел от 1 до 97.
//        После создания выведите все элементы массива в консоль.
//        После чего выведите этот же массив, но в обратном порядке.
//          1 3 5 7 9 11 ... 97
        System.out.println("_______Cоздаем цикл, чтобы посмотреть сколько занчений __");
        int count = 0; // объявляем переменную, в которую будем считать, сколько чисел мы вывели в консоль
        for(int i = 1; i <=97; i=i+2) {
//            System.out.println(i); // смотрели правильные ли цифры
            count++; // считали
        }
        System.out.println(count); // получилось 49 элементов
        System.out.println("_____Создадим массив с нужным количеством элементов_____");
        int[] oddNumbers = new int[count]; // создали массив из 49 элементов
        // на данном этапе в массиве хранятся нули - значения по умолчанию
        System.out.println(oddNumbers[1]);
//        oddNumbers[0] = 1; здесь попробовали вручную записать значения в массив
//        oddNumbers[1] = 3;
//        oddNumbers[2] = 5;
//        oddNumbers[3] = 7;
//        oddNumbers[48] = 97;

        System.out.println("_____Заполняем массив_____");
        int currentNumber = 1;
        for(int i = 0 ; i < oddNumbers.length; i++) {
            oddNumbers[i] = currentNumber; //  заполняем ячейку массива под индексом i
            currentNumber +=2; // мы увеличиваем при каждой итерация
        }
        System.out.println("_____Выводим в консоль_____");
//        System.out.println(oddNumbers[0]);
//        System.out.println(oddNumbers[1]);
//        System.out.println(oddNumbers[2]);
        for(int i = 0; i < oddNumbers.length; i++) {
            System.out.println(oddNumbers[i]);
        }
        System.out.println("_____Выводим в обратном порядке_____");

//        System.out.println(oddNumbers[48]); // начинаем с ленгс - 1
//        System.out.println(oddNumbers[47]);
//        System.out.println(oddNumbers[46]);

//        System.out.println(oddNumbers[0]); // доходим до нуля
        for(int i = oddNumbers.length-1; i >= 0; i--) {
            System.out.println(oddNumbers[i]);
        }

//        System.out.println("_____отступление____");
//        //                      0   1   2     3
//        int[] alishersNumbers = {4, 18, 259, -19};
//        System.out.println(alishersNumbers.length);
//        System.out.println(alishersNumbers[alishersNumbers.length - 1]);

    }
}
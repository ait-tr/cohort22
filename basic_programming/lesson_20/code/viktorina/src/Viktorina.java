import java.util.Scanner;

public class Viktorina {
    static int counter = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вопрос 1: В какой стране находится Прага?");
        String answer1 = sc.nextLine();
        String rightAnswer1 = "Чехия";
        question(rightAnswer1, answer1);

        System.out.println("Вопрос 2: Какой герой мультфильма живет в ананасе под водой?");
        String answer2 = sc.nextLine();
        String rightAnswer2 = "Губка Боб";
        question(rightAnswer2, answer2);

        System.out.println("Вопрос 3: Как называется колокол часов Вестминстерского дворца в Лондоне?");
        String answer3 = sc.nextLine();
        String rightAnswer3 = "Биг Бен";
        question(rightAnswer3, answer3);

        System.out.println("Вопрос 4: Кто написал знаменитый дневник, скрываясь от нацистов в Амстердаме?");
        String answer4 = sc.nextLine();
        String rightAnswer4 = "Анна Франк";
        question(rightAnswer4, answer4);

        System.out.println("Вопрос 5: Из чего сделан самый крепкий дом в \"Трех поросятах\"?");
        String answer5 = sc.nextLine();
        String rightAnswer5 = "Кирпич";
        question(rightAnswer5, answer5);

        sc.close();
        System.out.println(counter);
    }

    public static void question(String correctAnswer, String userAnswer){
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Совершенно верно!");
            counter++;
        } else {
            System.out.println("Ответ не верный! Стоит попробовать ещё.");
            System.out.println("Правильный ответ: " + correctAnswer);
        }
    }
}
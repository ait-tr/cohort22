import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int score = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("Чего нет в женской сумке?");
        String answer = sc.nextLine();
        String rightAnswer = "Порядка";
        if (answer.equalsIgnoreCase(rightAnswer)) {
            System.out.println("Правильно!");
            System.out.println("*******************************");
            score++;
        } else {
            System.out.println("Неправильно. Правильный ответ: " + rightAnswer);
            System.out.println("*******************************");
            score++;
        }

        System.out.println("Может ли пингвин назвать себя птицей?");
        String answer2 = sc.nextLine();
        String rightAnswer2 = "Нет";
        if (answer2.equalsIgnoreCase(rightAnswer2)) {
            System.out.println("Правильно!");
            System.out.println("*******************************");
            score++;
        } else {
            System.out.println("Неправильно. Правильный ответ: " + rightAnswer2);
            System.out.println("*******************************");
        }

        System.out.println("Что принадлежит тебе, но чаще используют другие?");
        String answer3 = sc.nextLine();
        String rightAnswer3 = "Имя";
        if (answer3.equalsIgnoreCase(rightAnswer3)) {
            System.out.println("Правильно!");
            System.out.println("*******************************");
            score++;
        } else {
            System.out.println("Неправильно. Правильный ответ: " + rightAnswer3);
            System.out.println("*******************************");
        }

        System.out.println("Что всегда на земле, никогда не бывает грязным?");
        String answer4 = sc.nextLine();
        String rightAnswer4 = "Тень";
        if (answer4.equalsIgnoreCase(rightAnswer4)) {
            System.out.println("Правильно!");
            System.out.println("*******************************");
            score++;
        } else {
            System.out.println("Неправильно. Правильный ответ: " + rightAnswer4);
            System.out.println("*******************************");
        }
        System.out.println("Ваш счет " + score);



    }
}
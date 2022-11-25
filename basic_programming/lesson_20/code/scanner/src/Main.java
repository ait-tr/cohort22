import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создали сканер

        System.out.println("Введите слово"); //
        String word = sc.nextLine(); // ввод для стринга // программа будет ждать пока введем
        // nextLine // используем, чтобы получить String
        System.out.println("Вы написали: " + word);

        System.out.println("Введите число");
        int number = sc.nextInt();
        System.out.println("Ваше число: " + number);

        System.out.println("Введите дабл");
        double doubleNumber = sc.nextDouble();
        System.out.println("Ваш дабл: " + doubleNumber);

        boolean isHungry = sc.nextBoolean(); //если хотим ввести true или false
        sc.close(); // если хотим остановить сканер
    }
}
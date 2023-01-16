import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = 0;
        try {
            x = scanner.nextInt();
        } catch(Exception e){
            System.out.println("Вводите только инты");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
        System.out.println(x);
//
    }
}
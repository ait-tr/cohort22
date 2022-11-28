import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    endlessCalculator();
    }
    public static void endlessCalculator() {
        boolean indicator = true;
        while(indicator) {
            calculator();
            System.out.println("Хотите продолжить? (да/нет)");
            Scanner sc = new Scanner(System.in); // создали объект сканер
            String answer = sc.next();
            if (answer.equals("нет")) {
                indicator = false;
            }
        }
    }

    public static void calculator(){
        Scanner sc = new Scanner(System.in); // создали объект сканер

        System.out.println("Введите первое число");
        double x1 = sc.nextDouble();  // вводим дабл

        System.out.println("Введите второе число");
        double x2 = sc.nextDouble(); // еще дабл

        System.out.println("Введите оператор: +, -, *, /");
        String operation = sc.next(); // вводим стринг
        switch(operation){
            case("+"):
                System.out.println(x1+x2);
                break;
            case("-"):
                System.out.println(x1-x2);
                break;
            case("*"):
                System.out.println(x1*x2);
                break;
            case("/"):
                System.out.println(x1/x2);
                break;
            default:
                System.out.println("Error");
        }
    }
}
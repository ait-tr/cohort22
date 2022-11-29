import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону 1");
        int a = sc.nextInt();
        System.out.println("Введите сторону 2");
        int b = sc.nextInt();
        System.out.println("Введите сторону 3");
        int c = sc.nextInt();
        // нужно чтобы выполнялось для любых двух сторон
        // сумма двух любых сторон больше чем третья
        boolean result1 = isPossibleTriangle(a, b, c);
        System.out.println(result1);
        System.out.println("_______Результат________");
        System.out.println(isPossibleTriangle(a, b, c));
        System.out.println(isPossibleTriangle2(a, b, c));
        System.out.println(isPossibleTriangle3(a, b, c));
    }
    //  напишите метод с типом boolean - он принимает три параметра int
    public static boolean isPossibleTriangle(int a, int b, int c) {
        if (a + b < c){
            return false;
        } else if (b + c < a) {
            return false;
        } else if (c + a < b) {
            return false;
        } else {
            return true;
        }
    }
    public static boolean isPossibleTriangle2(int a, int b, int c){
        return (a + b > c) && (a + c > b) && (c + b > a);
    }
    public static boolean isPossibleTriangle3(int a, int b, int c){
        if ((a + b < c) || (b + c < a) || (c + a < b)){
            return false;
        }
        return true;
    }
}
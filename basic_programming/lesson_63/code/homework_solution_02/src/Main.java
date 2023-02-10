import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /*
Cоздайте функциональный интерфейс - который принимает строку и число и возвращает строку.
Cоздайте метод, который принимает строку, число и лямбду и возвращает новую строку.
Вызовите метод, передав в него лямбду, такую что возвращается строка повторенная указанное количество раз.
         */

        IntStringProcessor lambda = (string, num)->string.repeat(num);

        String result = multiplyString("Java is easy ", 10, lambda);
        System.out.println(result);




    }
    public static String multiplyString(String str, int number, IntStringProcessor lambda){
        return lambda.process(str, number);
    }
}
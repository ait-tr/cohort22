public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 7;
        int c = max(a, b);
        // метод берет два аргумента и возвращает наибольший
        System.out.println(c);
        System.out.println("________________");
        // если разница между числами равна 50 выводим yes, если нет - no
        int number1 = 73;
        int number2 = 122;
        if (number1 - number2 == 50 || number2 - number1 == 50) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println("________________");
        // дано число, если оно больше или равно 1453 - то выводим на экран "+",
        // если нет "-"
        int data = 1231231212;
        if (data >= 1453) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        System.out.println("________________");
    }
    public static int max (int arg1, int arg2) {
        if (arg1 > arg2) {

            return arg1;
        } else {
            return arg2;
        }
    }
}

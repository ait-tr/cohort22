public class Main {
    public static void main(String[] args) {
        // напишите метод, который принимает три числа
        // возвращает количество положительных чисел
        int first = 1;
        int second = 12312312;
        int third = -10;

        int numberOfPositive = numPositive(second, first, third);  // вернет 2
        System.out.println(numberOfPositive);
    }
    public static int numPositive(int a, int b, int c) {
        int count = 0;
        if (a>0) {
            count = count +1;
        }
        if (b>0) {
            count = count +1;
        }
        if (c>0) {
            count = count +1;
        }
        return count;
    }
}
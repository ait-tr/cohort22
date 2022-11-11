public class Main {
    public static void main(String[] args) {
        /*
        Напишите метод, который принимает int - стартовое значение,
        этот метод печатает числа от стартового значения до 240.
        Например, если я передал цифру 6:
        6 --> 6, 7, 8 , 9 ... 239 240
        10 ---> 10 , 11 , 12, 13 ... 238, 239, 240
        (для тех кому скучно - если мы передали цифру 270,
        он выводит 270 269 268 ... 240 )
         */
        int start = 250;
        showNumbers(start);
    }
    public static void showNumbers(int x) {
        if (x < 240) {
            for(int i = x; i <= 240; i++) {
                System.out.println(i);
            }
        } else {
            for(int i = x; i >= 240; i--) {
                System.out.println(i);
            }
        }
    }
}
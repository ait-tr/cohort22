public class Main {
    public static void main(String[] args) {
        int acc = 0;
        for(int i = 0; i < 10; i++ ) {
            System.out.println("Iteration " + i + " acc " + acc);
            acc +=2;
        }
        System.out.println(acc);
        System.out.println("___________");
        // for который выводит цифры 10 9 8 7 ... 2 1 0

        for(int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("___________");

        int start = 100;
        fromStart(start);
        // на метод for
        // метод, который принимает int - начальное значение
        // этот метод печатает числа от начального значения до 240
        // Например, если я передал цифру 6   -->  6, 7, 8 , 9  ,,,, 239 240
        // 10 --->  10 , 11 , 12, 13 ....   238, 239, 240

        // со звездочкой
        // для тех кому скучно -
        // если мы передали цифру 270    он выводит 270 269 268 ,,,,   240
    }
    public static void fromStart(int start) {
        // и так далее
    }
}
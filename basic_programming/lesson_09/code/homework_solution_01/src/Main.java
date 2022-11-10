public class Main {
    public static void main(String[] args) {
        // больше 200 -->  +
        // меньше -200  --> -
        // мeжду 200 и -200 --> ok
        int input = -7;
        plusMinusOk(input);

    }
    public static void plusMinusOk(int x) {
        if (x > 200) {
            System.out.println("+");
        } else if (x < -200) {
            System.out.println("-");
        } else {
            System.out.println("ok");
        }
    }
}
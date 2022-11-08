public class Main {
    public static void main(String[] args) {
        int number1 = 123;
        int number2 = 10;
        int number3 = 233;
        moreThan10(number1, number2, number3);
    }
    public static void moreThan10(int first, int second, int third) {
        if (first > 10 && second > 10 && third > 10){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        //System.out.println(sumOfDigits(126)); // 6 , 2, 1
        //
    }

    public static void printDigits(int number) {
        System.out.println(number % 10);
        if (number > 10) {
            printDigits(number / 10);
        }
    }

    public static int sumOfDigits(int x) {
        x = Math.abs(x);
        if (x >= 10) {
            return x % 10 + sumOfDigits(x / 10);
        }
        return x;
    }

    public static void printAllUntil(int finish) {
        recPrint(0, finish);
    }

    public static void recPrint(int start, int finish) {
        System.out.println(start);
        if (start < finish) {
            recPrint(start + 1, finish);
        }
    }

}
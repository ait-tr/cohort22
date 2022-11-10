public class Main {
    public static void main(String[] args) {
        double first = 17;
        double second = 7;
        int operator = 6; // 1 +, 2 -, 3 *, 4 /, 5 %
        double result = calculate(first, second, operator);
        System.out.println(result);
    }
    public static double calculate (double x1, double x2, int oper) {
        if (oper == 1) {
            return x1 + x2;
        }
        if (oper == 2) {
            return x1 - x2;
        }
        if (oper == 3) {
            return x1 * x2;
        }
        if (oper == 4) {
            return x1 / x2;
        }
        if (oper == 5) {
            return x1 % x2;
        }
        System.out.println("Error: invalid operation");
        return -1;
    }
}
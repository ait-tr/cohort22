public class Main {
    public static void main(String[] args) {
        CanCalculate sum = (a, b) -> a + b;
        System.out.println(sum.calculate(1, 2));


        CanCalculate calculation = (a, b)->{
            System.out.println("Привет!");
            return a+b;
        };
        calculation.calculate(1,2);

        CanCalculate calculation2 = (a, b)->a*b;
        System.out.println(calculation2.calculate(2, 3));
    }
}
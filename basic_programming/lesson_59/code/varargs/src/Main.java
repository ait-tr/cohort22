public class Main {
    public static void main(String[] args) {

        // varargs
      /*
        Напишите метод, который принимает произвольное число аргументов типа String
        и еще один String - сепаратор. Сепаратор - это указанный набор символов, через которые
        мы будем соединять все пришедшие аргументы.
        unify("*-*", "конь", "кошка", "машина") --> "конь*-*кошка*-*машина*-*"
       */
        System.out.println(calculate(1, 2));

        System.out.println(unify("*-*", "конь", "кошка", "машина"));
    }

    public static String unify(String separator, String... elements) {
        String result = "";
        for (int i = 0; i < elements.length - 1; i++) {
            result += elements[i] + separator;
        }
        result += elements[elements.length - 1];
        return result;
    }

    public static int calculate(int... numbers) {
        int accum = 0;
        for (int i = 0; i < numbers.length; i++) {
            accum += numbers[i];
        }
        return accum;
    }


}
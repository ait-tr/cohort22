import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // анонимный класс
        Operationable sum = new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };
        System.out.println(sum.calculate(9, 12));

        // лямбда

        Operationable subtraction = (a, b) -> a - b;
        Operationable subtraction2 = (a, b) -> {
            return a - b;
        };
        int randomNumberFromScope = 9;
        Operationable subtraction3 = (a, b) -> {
            System.out.println("Хехей!");
            System.out.println(randomNumberFromScope);
            return a - b;
        };

        System.out.println(subtraction.calculate(12, 9));
        System.out.println(subtraction.calculate(16, 5));

        VoidInterface<String> printString = (str) -> System.out.println(str);
        printString.print("Privet, I am terminal lambda");
        // если нет аргументов
        NoArgInterface losung = () -> System.out.println("Нету тела - нету дела");
        losung.printLosung();
        /*
        Написать функциональный интерфейс,
        который принимает число и возвращает булево значение.
        Написать реализацию этого интерфейса в виде лямбда-выражения, которое возвращает
        true - если число делится без остатка на 12.

        Создать несколько других реализаций с другими числами(без остатка на 24);
         */
        Devider dev = (x) -> {
            if (x % 12 == 0) {
                return true;
            }
            return false;
        };
        Devider dev2 = (x) -> x % 12 == 0; // можем написать вот таким способом
        System.out.println(dev.isDevBy12(241));
        System.out.println(dev.isDevBy12(24));
        System.out.println(dev2.isDevBy12(24));
        System.out.println(dev2.isDevBy12(25));
        //
        /*
        Напишите функциональный интерфейс, который принимает
        две строки.

        Создайте лямбда-выражение, которая реализует данный интерфейс. Она должна
        принимать две строки и возвращать наиболее длинную.

        Дополнительно**
        Пусть возвращаемая строка будет переведена в upperCase,
        и из нее должны быть убраны все запятые.
         */
        TwoStringInterface tsi = (s1, s2)-> {
            if(s1.length()>s2.length()){
                return s1;
            }
            return s2;
        };
        System.out.println(tsi.getLongest("Привет!", "Приветик"));

        TwoStringInterface tsi2 = (s1, s2)-> {
            if(s1.length()>s2.length()){
                return s1.toUpperCase().replaceAll(",","");
            }
            return s2.toUpperCase().replaceAll(",","");
        };
        System.out.println(tsi2.getLongest("Привет, как дела?", "Приветик, гуд"));
        // c varargs
        ManyStrInterface manyStrInter = (strings)->{
            ArrayList<String> list = new ArrayList<>(List.of(strings));
            Collections.sort(list, (a, b)->-Integer.compare(a.length(), b.length()));
            return list.get(0);
        };
        System.out.println(manyStrInter.getLongest("ва", "asd", "asdas"));

        System.out.println("*".repeat(10));
        // мы можем передавать лямбды в качестве параметров

        System.out.println(doSmthWithString("Jerry Garcia", (a) -> a.toUpperCase()));
        /*
        Cоздайте функциональный интерфейс - который принимает строку и число
        и возвращает строку.
        Cоздайте метод, который принимает строку, число и лямбду
        и возвращает новую строку.
        Сделайте реализацию этого интерфейса,
        в которой возвращается строка повторенная указанное количество раз.

          */

    }
    public static String doSmthWithString(String str, OneArgInterface operator){
        return operator.action(str);
    }



}
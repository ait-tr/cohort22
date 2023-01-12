import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SLinkedList fruits = new SLinkedList();
        fruits.add("Avocado");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Figga");
        System.out.println(fruits);
        System.out.println(fruits.getFirst()); // --> должен вернуть "Avocado"
        System.out.println(fruits.getLast());  // --> должен вернуть "Figga"
        // addFist(String string) - добавляет в начало
        //
        // в качестве тренировки давайте метод printAll
        // fruits.printAll() - распечатает все элементы.
        // do while - будем печатать пока не наткнемся на null
        System.out.println("*".repeat(10));
        fruits.printAll();
        System.out.println(fruits.size());

        // ниже рекурсивная функция
        recPrint(55); // --> 55 54 53 52 ... 0

    }
    // рекурсия - когда внутри метода вызывается сам этот метод
    public static void recPrint(int number){
        System.out.println(number);
        if (number > 0) {
            recPrint(number-1);
        }
    }
}
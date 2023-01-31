import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(12);
        numbers.add(9);
        numbers.add(18);
        numbers.add(22);
        numbers.add(94);
        System.out.println(numbers.first());
        System.out.println(numbers.last());
        System.out.println(numbers.subSet(12, 22));

        System.out.println(numbers.headSet(18));  // от первого(самый маленький) включительно до указанного, не включительно
        // ^ все что меньше 18
        System.out.println(numbers.tailSet(18)); // все элементы от указанного включительно и больше
        // ^ 18 и все что больше
        // numbers.add(null); // в TreeSet нельзя хранить null
        LocalDate localDate = LocalDate.of(2022, 12, 14);
        System.out.println(localDate);
        LocalDate localDate2 = LocalDate.of(2023, 01, 15);
        LocalDate localDate3 = LocalDate.of(2023, Month.MARCH, 15);

        System.out.println(localDate2);
        System.out.println(localDate.compareTo(localDate2));
        System.out.println(LocalDate.parse("2022-11-15"));


        // Представим себе, что мы работаем на свадебное бюро,

        // Создать класс Place с полями
        // - вместимость
        // - адрес

        // Создать класс свадьба Wedding с полями:
        // - date - тип LocalDate
        // - имя жениха groomsNam
        // - имя невесты bridesName
        // - место проведения - тип Place


        // Создать множество свадеб
        // и выделить подмножество - все свадьбы с какого-то числа по какое-то другое число;

    }
}
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        System.out.println(LocalDate.of(2022, 12, 25));
        Wedding wedding1 = new Wedding(
                "Ivan",
                "Maria",
                LocalDate.of(2023, 02, 10),
                new Place(20, "CandySHop str 28")
        );


        TreeSet<Wedding> weddings = new TreeSet<>();
        weddings.add(new Wedding(
                "Ivan",
                "Maria",
                LocalDate.of(2023, 02, 10),
                new Place(20, "CandySHop str 28")
        ));
        weddings.add(new Wedding(
                "Max",
                "Vika",
                LocalDate.of(2023, 03, 10),
                new Place(20, "CandySHop str 28")
        ));
        weddings.addAll(
                Set.of(
                        new Wedding(
                                "Igor",
                                "Sveta",
                                LocalDate.of(2023, 03, 11),
                                new Place(20, "CandySHop str 28")
                        ),
                        new Wedding(
                                "Vova",
                                "Galya",
                                LocalDate.of(2023, 03, 12),
                                new Place(20, "CandySHop str 28")
                        ),
                        new Wedding(
                                "Egor",
                                "Olya",
                                LocalDate.of(2023, 03, 13),
                                new Place(20, "CandySHop str 28")
                        )
                )
        );
        System.out.println(weddings);
        System.out.println("*".repeat(10));

        Set<Wedding> result = weddings.subSet(
                new Wedding(
                        LocalDate.of(2023, 02, 13)
                ),
                false, // если написали фолс - не включительно
                new Wedding(
                        LocalDate.of(2024, 03, 12)
                ),
                false
        );
        for(Wedding wedding: result){
            System.out.println(wedding);
        }


        /*
        Представим себе, что мы работаем на свадебное бюро.
        Создать класс место Place с полями
               - вместимость
               - адрес

        Создать класс свадьба Wedding с полями:
        - date - тип LocalDate
        - имя жениха groomsName
        - имя невесты bridesName
        - место проведения - тип Place


        Создать множество свадеб
        и выделить подмножество - все свадьбы с какого-то числа по какое-то другое число;

         */
    }
}
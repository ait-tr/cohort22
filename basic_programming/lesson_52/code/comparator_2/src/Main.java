import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(20));
        persons.add(new Person(18));
        persons.add(new Person(26));
        persons.add(new Person(29));
        Collections.sort(persons, new PersonByAgeComparator());
//        persons.sort(new PersonByAgeComparator());
        System.out.println(persons);
        // вместо того, чтобы создавать новый класс реализующий компаратор,
        // мы можем создать анонимный класс
        // попробуем отсортировать в обратном порядке по возрасту
        Collections.sort(persons, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2){
                return -Integer.compare(o1.age, o2.age);
                // return o1.name.compareTo(o2.name); // для сравнения по имени
            }

        });
        System.out.println(persons);
        //
        // Создайте класс Jewelery украшение с полями
        //  - goldContent проба до 1000
        //  - weight вес
        //  - title имя
        //  - price цена
        // Создайте ArrayList с украшениями. Добавьте туда 5 украшений.
        //
        // Отсортируйте, используя анонимные классы производные от интерфейса
        // Comparator, по всем полям по очереди, распечатывая результат.

        ArrayList<Jewelery> jeweleries = new ArrayList<>();
        jeweleries.add(new Jewelery("Ring", 3, 500, 888));
        jeweleries.add(new Jewelery("Golden Chain", 20, 3000, 930));
        jeweleries.add(new Jewelery("Necklace", 26, 2500, 800));
        jeweleries.add(new Jewelery("Silver Earrings", 20, 1000, 0));
        System.out.println(jeweleries); // до сортировки
        Collections.sort(jeweleries, new Comparator<Jewelery>() {
            @Override
            public int compare(Jewelery o1, Jewelery o2) {
                return Integer.compare(o1.getGoldContent(), o2.getGoldContent());
            }
        });
        System.out.println(jeweleries); // по содержанию золота

        Collections.sort(jeweleries, new Comparator<Jewelery>() {
            @Override
            public int compare(Jewelery o1, Jewelery o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        System.out.println(jeweleries); // по имени в алфавитном порядке

        Collections.sort(jeweleries, new Comparator<Jewelery>() {
            @Override
            public int compare(Jewelery o1, Jewelery o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        }.reversed());
        System.out.println(jeweleries);

    }
}
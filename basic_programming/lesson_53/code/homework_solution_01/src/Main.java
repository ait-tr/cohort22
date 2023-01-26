
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
Создайте класс Kid ребенок с полями
- имя ребенка
- имя родителя или представителя
- название группы
- возраст
- рост

Создайте ArrayList детей.
Используя анонимные классы созданные на основе интерфейса Comparator, отсортируйте по очереди по всем полям.
* Попробуйте вынести сортировки в отдельные методы.
 */
        ArrayList<Kid> kids = new ArrayList<>();
        kids.add(new Kid("В", "Александр Иванович Соколов", "Утро 2", 5, 122));
        kids.add(new Kid("А", "Георгий Иванович Соколов", "Утро 1", 4, 119));
        kids.add(new Kid("Я", "Янн Иванович Соколов", "Утро 4", 5, 100));
        kids.add(new Kid("А", "Александр Иванович Соколов", "Утро 1", 5, 115));
        kids.add(new Kid("А", "Александр Иванович Соколов", "Утро 1", 6, 115));

        System.out.println("До сортировки");
        System.out.println(kids);

        System.out.println("Сортируем по имени");
        sortByName(kids);
        System.out.println(kids);

        System.out.println("Сортируем по возрасту");
        KidTools.sortByAge(kids);
        System.out.println(kids);

        System.out.println("Сортируем по двум признакам");
        KidTools.sortByNameAndThanByAge(kids);
        System.out.println(kids);

        Kid semen = new Kid("Семен", "Александр Иванович Соколов", "Утро 2", 5, 122);
        semen.ourMethod();

        Kid.ourMethod2(semen);


    }

    public static void sortByName(List<Kid> kids) {
        Collections.sort(kids, new Comparator<Kid>() {
            @Override
            public int compare(Kid o1, Kid o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

}
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> electoCars = new TreeSet<>();
        electoCars.add("Tesla");
        electoCars.add("GolfCar");
        electoCars.add("BMW");
        electoCars.add("Z-mobile");
        electoCars.add("Z-mobile");
        System.out.println(electoCars);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(21312);
        numbers.add(21);
        numbers.add(9);
        System.out.println(numbers);

        TreeSet<Car> cars = new TreeSet<>();
        // создали отсортированное множество
        // не забыли реализовать методы интерфейса Comparable
        cars.add(new Car("Tesla", 2, 230));
        cars.add(new Car("BMW", 6, 250));
        cars.add(new Car("Opel", 4, 210));
        System.out.println(cars);

        System.out.println("*".repeat(10));

        TreeSet<Car> cars2 = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
//                return o1.title.compareTo(o2.title);
                return Double.compare(o1.engineVolume, o2.engineVolume);
            }

        });
        cars2.add(new Car("Aesla", 2, 230));
        cars2.add(new Car("BMW", 6, 250));
        cars2.add(new Car("Wopel", 4, 210));
        cars2.add(new Car("Kay", 4, 230));
        cars2.add(new Car("Kay", 4, 240));

        System.out.println(cars2);

        /*
        Создайте класс пост Post - с полями:
         - количество лайков likesNumber
         - текст поста text
         - количество репостов repostsNumber
         - id - индивидуальное поле (не статическое)
         - totalNumberOfPosts - всего постов - это статическое поле для расчета id
         totalNumberOfPost - можно увеличивать в конструкторе.

        Создайте два TreeSet:
        - первый при помощи интерфейса Comparable - по id
        - второй при помощи интерфейса Comparator - по количеству лайков
        со звездочкой:
        - отсортируйте по длине поста




         */
    }
}
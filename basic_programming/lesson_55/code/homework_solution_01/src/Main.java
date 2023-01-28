import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /*
        Создайте класс Flower, пусть у него будут поля цвет и название.
        Создайте класс Event, с полями название и описание.

        Создайте HashMap<Event, Flower> заполните его событиями и цветами.
        Например, свадьба = роза красная.

        Проверьте есть ли в получившемся мапе какой-нибудь конкретный ключ.
        Проверьте есть ли в получившемся мапе какое-нибудь конкретное значение.
         */
        Map<Event, Flower> flowerByEvents = new HashMap<>();
        flowerByEvents.put(
                new Event("Wedding of George", "on Wednesday 19:00"),
                new Flower("rose", "red")
                );
        flowerByEvents.put(
                new Event("Funeral of Bob", "on Friday 12:00"),
                new Flower("astra", "red")
        );
        flowerByEvents.put(
                new Event("Funeral of Bob", "on Friday 12:00"),
                new Flower("astra", "red")
        );
        System.out.println(new Event("Funeral of Bob", "on Friday 12:00").hashCode());
        System.out.println(new Event("Funeral of Bob", "on Friday 12:00").hashCode());


        System.out.println(flowerByEvents);

        boolean isThereAKey = flowerByEvents.containsKey(new Event("Wedding of George","on Wednesday 19:00"));
        System.out.println(isThereAKey);
        System.out.println(flowerByEvents.containsValue(new Flower("tulip", "pink")));


    }
}
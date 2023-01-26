import javax.swing.text.html.parser.Entity;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> giftsByNames = new HashMap<>();
        giftsByNames.put("George", "Horse");
        giftsByNames.put("Anna", "Doll");
        giftsByNames.put("Maria", "Barbie");
        System.out.println(giftsByNames);
        System.out.println(giftsByNames.get("Maria"));
        giftsByNames.remove("Anna");
        System.out.println(giftsByNames);
//        giftsByNames.clear();
//        System.out.println(giftsByNames);
        giftsByNames.put("Sabine", "Pen");
        giftsByNames.put("Evgeniy", "Laptop");
        giftsByNames.put("Natalia", "New Iphone");
        giftsByNames.put("ksdfkd", "New Iphone");
        giftsByNames.put("adfasd", "Samsung");
        System.out.println("Igor".hashCode()%16);

        System.out.println(giftsByNames);

        HashMap<String, Integer> ageByName = new HashMap<>(32, 0.75f);



//        System.out.println(giftsByNames.keySet());
//
//        for(String key : giftsByNames.keySet()){
//            System.out.println(giftsByNames.get(key));
//        }
//
//        System.out.println(giftsByNames.values());
//
        System.out.println(giftsByNames.entrySet());
//
//        for(String key : giftsByNames.keySet()){
//            System.out.println(key +":"+giftsByNames.get(key));
//        }
//

        /*
        Представим себе отель.
        Создайте класс клиент с полями имя, фамилия, пол. (не забудьте сгенерировать hashCode и equals)

        Создайте HashMap из пар ключ: Client и значение: Integer - номер его комнаты.

        Добавьте пять клиентов.
        Пройтись циклом распечатывая только номера клиентов.
         */
        HashMap<Client, Integer> roomNumbersByClients = new HashMap<>(Map.of(
                new Client("John", "Batist", true), 12,
                new Client("Bob", "Marley", true), 15
        ));
        roomNumbersByClients.put(new Client("John", "Batist", true), 18);
        roomNumbersByClients.put(new Client("John", "Nemeth", true), 39);
        System.out.println(roomNumbersByClients.size());
        System.out.println(roomNumbersByClients);

        // как распечатать значения?
        for(Client key:roomNumbersByClients.keySet()){
            System.out.println(roomNumbersByClients.get(key));
        }
        // через values
        for(Integer value: roomNumbersByClients.values()){
            System.out.println(value);
        }


        /*
        Создайте абстрактный класс Pet и три производных класса Cat, Snake, Hamster.
        Создайте HashMap с ключами типа Pet и значением типа класс Feed.
        Пусть у класса Feed будут поля название и с чем корм - начинка.

        После этого распечатайте все ключи.
        И проверьте есть ли какой-нибудь конкретный ключ в HashMap. (посмотрите какие методы есть)
         */
        HashMap<Pet, Feed> feedsByPet = new HashMap<>();
        feedsByPet.put(new Snake("Longie", 18), new Feed("Snake feed", "frogs"));
        feedsByPet.put(new Cat("Fluffy", 3), new Feed("Sheba", "salmon"));
        feedsByPet.put(new Hamster("Mr. Seeders", 2), new Feed("Hamster feed", "seeds"));

        for(Pet key: feedsByPet.keySet()){
            System.out.println(key);
        }

        System.out.println(feedsByPet.containsKey(new Snake("Bob", 12)));
        System.out.println(feedsByPet.containsKey(new Snake("Longie", 18)));
        System.out.println(feedsByPet.keySet().contains(new Snake("Longie", 18)));

    }
}
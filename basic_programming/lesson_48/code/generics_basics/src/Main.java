import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("generics_basics");
//        System.out.println("Первые соображения");
//        ArrayList numbers = new ArrayList();
//        numbers.add(1);
//        numbers.add("Heyheyehye");
//        numbers.add(false);
//        System.out.println(numbers);
//
//        ArrayList<Integer> numbers2= new ArrayList<>();
//        numbers2.add(1);
        System.out.println("Дальнейшие рассуждения об обобщениях");
        BoxOfDoubles box1 = new BoxOfDoubles(2.2);
        box1.print();
        BoxOfString box2 = new BoxOfString("Hello, I'm box of strings");
        box2.print();
        Box<String> box3 = new Box<>("asdfas");
        Box<Banana> box4 = new Box<>(new Banana());
        BoxOfFruits<Fruit> box5 = new BoxOfFruits<>(new Fruit());
        /*

        Создайте обобщенный класс рюкзак Backpack с полями String brand,
        и параметризированным полем content.
        сontent должен быть ограничен классом Book;
        Создайте рюкзак книг с книгой внутри.



         */



    }
}
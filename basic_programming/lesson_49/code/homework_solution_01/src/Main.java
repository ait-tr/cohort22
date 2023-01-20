import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Домашнее задание
//        Создать интерфейс Eatable.
//                Создать абстрактный класс Food, который имплиментирует этот интерфейс.
//                Создать несколько классов еды на ваше усмотрение.
//        Создайте класс судочек:  Container с полями:
//        а) типа String brand,
//        б) типа double volume,
//        с) поле content параметризированного типа, наследующего интерфейс Eatable.
//        После чего создайте в main судочки с разной едой.

        Container<Sushi> sushiBox = new Container<>("Tupperware", 0.5, new Sushi());
        Container<Food> sushiBox2 = new Container<>("Saleron", 0.5, new Sushi());

    }
}
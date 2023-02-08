import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        enum Color {  // для истории
//            GREEN, RED, WHITE;
//        }
        Color color = Color.RED;
        String color2 = "Orange";  // если тип стринг, мы можем написать любое стринговое значение
        Color color3 = Color.GREEN;// а здесь можем выбирать только из того что есть
        System.out.println(color);
        int price = 0;
        switch (color) {
            case RED: {
                price = 120;
                break;
            }
            case GREEN: {
                price = 100;
                break;
            }
            case WHITE: {
                price = 110;
                break;
            }
        }
        System.out.println("Цена яблока равна: " + price);
        if (color == Color.RED) { // для сравнения enum используем ==
            System.out.println("Яблоко-то у нас красное!");
        }
        System.out.println(color.name());
        System.out.println(Arrays.toString(Color.values())); // от класса
        for (Color c : Color.values()) {   // а можем распечатать таким образом
            System.out.println(c);
        }
        System.out.println(color.ordinal()); // индекс в массиве - красный по индексу 1
        System.out.println(Color.valueOf("RED")); // возвращает значение по имени

        // Переменные и методы в ENUM
        System.out.println(Temperature.HOT.getTemp());
        System.out.println(Temperature.WARM.getTemp());
        System.out.println(Temperature.HOT.commentary);
        System.out.println(Temperature.COLD);

        // Enum с константами для методов
        System.out.println(Operation.SUM.action(12, 26));
        System.out.println(Operation.SUBTRACTION.action(20, 5));
    }
}
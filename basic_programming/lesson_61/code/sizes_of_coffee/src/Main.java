public class Main {
    public static void main(String[] args) {

        Coffee coffee = new Coffee("Blackwhite", Size.MEDIUM, "Vladimir");
        Coffee coffee2 = new Coffee("Capuccino", Size.SMALL, "Vladimir");
        Coffee coffee3 = new Coffee("Americano", Size.SPECIAL, "Vladimir");
        System.out.println(coffee);
        System.out.println(coffee2);
        System.out.println(coffee3.calculatePrice());


        /*
        Создайте enum Size с четырьмя размерами: SMALL, MEDIUM, BIG, SPECIAL
        Создайте класс кофе Coffee с полями:
            - название String title;
            - размер Size size;
            - для кого кофе String clientName;

        Пусть у кофе будет метод:
            - double calculatePrice() - метод возвращает стоимость кофе
                маленький кофе - 3 евро;
                средний - 3,5;
                большой - 4;
                специальный - 5;
         */
    }
}
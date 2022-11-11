public class Main {
    public static void main(String[] args) {
        /*
        Каждый день в корзину с грязным бельем попадает по две вещи,
        в корзину помещается 20 вещей. Как только вещей становится 20
        - их стирают и убирают из корзины. Напишите метод basket(days),
        в который мы передаем количество дней,
        этот метод выводит в консоль описание для каждого дня. Например:
            Day 1 busket has 0 clothes.
            Day 2 busket has 2 clothes.
            Day 3 busket has 4 clothes.
            Day 4 busket has 6 clothes.
            ...
            Day 2 busket has 18 clothes.
            Day n busket has z clothes.
         */
        int days = 70;
        basket(days);
    }
    public static void basket(int x) {
        int clothes = 0;
        for(int i = 1; i <= x; i++) {
            System.out.println("Days " + i + " busket has " + clothes);
            clothes += 2;
            if (clothes > 20) {
                clothes = 0;
            }
        }
    }
}







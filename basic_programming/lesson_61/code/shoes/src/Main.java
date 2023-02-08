public class Main {
    public static void main(String[] args) {
    /*
         Нужно создать enum Leather
         c полем int price - цена за метр квадратный
            Cow - стоит 50
            Crocodile - стоит 1000
            Sheep - 70
            Fish - 500
        Сделать класс Сумка Bag c полями:
            Leather material;
            double leatherArea; - площадь материала

        Пусть у сумки будет метод
           calculatePrice()
           рассчитывает стоимость из расчета площадь, умноженная на стоимость материала.
        */

        Bag gucci = new Bag(Leather.CROCODILE, 0.5);
        System.out.println(gucci.calculatePrice());

        Bag dior = new Bag(Leather.FISH, 0.7);
        System.out.println(dior.calculatePrice());
    }
}
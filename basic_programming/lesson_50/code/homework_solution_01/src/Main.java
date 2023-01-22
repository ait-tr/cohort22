public class Main {
    public static void main(String[] args) {

        //+ Создайте класс шляпа с полем цена и другими полями на ваш вкус.
        //+ Создайте класс колекция-шляп с полем типа HashSet <Hat> и полем общая стоимость totalValue.
        //+ Пусть у коллекции будет метод buyNew(Hat hat) пусть этот метод добавляет в коллекцию-шляп только новые шляпы, которых еще нет в коллекции.
        //+ Если шляпа успешно добавилась в колекцию-шляп, то стоимость коллекции шляп должна увеличится на стоимость данной шляпы.
        Hat fedora = new Hat("Fedora", 150,28, "Germany");
        System.out.println(fedora);
        HatCollection gangstersHats = new HatCollection("Gangsters hats");
        gangstersHats.buyNewHat(fedora);
        gangstersHats.buyNewHat(new Hat("Homburg", 120, 27, "Germany"));// + к стоимости коллекции
        gangstersHats.buyNewHat(new Hat("Homburg", 120, 27, "Germany"));// ничего не происходит
        gangstersHats.buyNewHat(new Hat("Porkpie", 200, 27, "Great Britain"));// + к стоимости коллекции
        gangstersHats.buyNewHat(new Hat("Porkpie", 200, 27, "Great Britain"));// + к стоимости коллекции

        System.out.println(gangstersHats);

    }
}
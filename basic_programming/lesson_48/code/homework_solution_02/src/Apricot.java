public class Apricot extends Fruit {
    private static double price = 2;
    private static double totalPrice;
    public Apricot(double weight) {
        super(weight);
        totalPrice += getCost();
    }

    public static double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public double getCost() {
        return getWeight() * price;
    }
}

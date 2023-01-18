public class Pear extends Fruit{
    private static double price = 1.5;
    private static double totalPrice;
    public Pear(double weight) {
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

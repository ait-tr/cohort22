public class Apple extends Fruit{
    private static double price = 1.2;
    private static double totalPrice;
    public Apple(double weight) {
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

public abstract class Fruit {
    public static int counter;
    public static double totalCostOfFruits =0;
    private double weight;
    public void printManufacturerInfo(){
        System.out.print("Made in Turkey");
    }
    public double getWeight(){
        return weight;
    }
    public abstract double getCost();

    public Fruit(double weight) {
        this.weight = weight;
        counter++;
        totalCostOfFruits += getCost();
    }
}

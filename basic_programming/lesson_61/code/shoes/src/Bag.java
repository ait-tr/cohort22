public class Bag {
    Leather material;
    double leatherArea;

    public Bag(Leather material, double leatherArea) {
        this.material = material;
        this.leatherArea = leatherArea;
    }

    public double calculatePrice() {
        return material.getPrice() * leatherArea;
    }
}

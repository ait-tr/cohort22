public class Backpack  <T extends Book>{
    String brand;
    T content;

    public Backpack(String brand, T content) {
        this.brand = brand;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "brand='" + brand + '\'' +
                ", content=" + content +
                '}';
    }
}

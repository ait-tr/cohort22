public class Container<T extends Eatable> {
    String brand;
    double volume;
    T content;

    public void say() {
        content.print();
    }

    public Container(String brand, double volume, T content) {
        this.brand = brand;
        this.volume = volume;
        this.content = content;
    }
}

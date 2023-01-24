public class Jewelery {
    private String title;
    private double weight;
    private double price;
    private int goldContent;

    public String getTitle() {
        return title;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getGoldContent() {
        return goldContent;
    }

    public Jewelery(String title, double weight, double price, int goldContent) {
        this.title = title;
        this.weight = weight;
        this.price = price;
        this.goldContent = goldContent;
    }

    @Override
    public String toString() {
        return "Jewelery{" +
                "title='" + title + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", goldContent=" + goldContent +
                '}';
    }
}

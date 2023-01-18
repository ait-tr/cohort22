public abstract class Product implements Comparable<Product>{
    private String title;
    private int price;

    public int compareTo(Product p){
        return -title.compareTo(p.title);
    }

    public Product(String title, int price){
        this.price = price;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}

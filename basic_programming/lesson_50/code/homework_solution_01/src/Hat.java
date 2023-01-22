import java.util.Objects;

public class Hat {
    private String title;
    private double price;
    private double size;
    private String country;

    public Hat(String title, double price, double size, String country) {
        this.title = title;
        this.price = price;
        this.size = size;
        this.country = country;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Hat{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hat hat = (Hat) o;
        return Double.compare(hat.price, price) == 0 && Double.compare(hat.size, size) == 0 && Objects.equals(title, hat.title) && Objects.equals(country, hat.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, size, country);
    }
}

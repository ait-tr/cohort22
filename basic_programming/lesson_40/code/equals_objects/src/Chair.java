import java.util.Objects;

public class Chair {
    private double price;
    private String title;
    private int year; // год выпуска

    public Chair(double price, String title, int year){
        this.price = price;
        this.title = title;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return Double.compare(chair.price, price) == 0 && year == chair.year && Objects.equals(title, chair.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, title, year);   // 1231231231234234923
    }
}

import java.util.Objects;

public class Coffee extends Drink implements Natural {
    private String title;

    public Coffee(double weight, String title) {
        super(weight);
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coffee coffee = (Coffee) o;
        return Objects.equals(title, coffee.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title);
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "title='" + title + '\'' +
                ", weight=" + weight +
                '}';
    }
}

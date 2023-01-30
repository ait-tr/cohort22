import java.util.Objects;

public class Tee extends Drink implements Natural {
    private String title;

    public Tee(double weight, String title) {
        super(weight);
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tee tee = (Tee) o;
        return Objects.equals(title, tee.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}

import java.util.Objects;

public class Bar<T extends Drink & Natural> {
    private String title;
    private String adress;
    private T drink;

    public Bar(String title, String adress, T drink) {
        this.title = title;
        this.adress = adress;
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "title='" + title + '\'' +
                ", adress='" + adress + '\'' +
                ", drink=" + drink +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bar<?> bar = (Bar<?>) o;
        return Objects.equals(title, bar.title) && Objects.equals(adress, bar.adress) && Objects.equals(drink, bar.drink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, adress, drink);
    }
}

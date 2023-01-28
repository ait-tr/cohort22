import java.util.Objects;

public class Event {
    String title;
    String description;

    public Event(String title, String description) {
        this.title = title;
        this.description = description;
    }


    @Override
    public String toString() {
        return String.format("%s %s", title, description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(title, event.title) && Objects.equals(description, event.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description);
    }
}

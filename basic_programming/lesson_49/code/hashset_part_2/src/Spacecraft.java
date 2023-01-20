import java.util.Objects;

public class Spacecraft {
    private String title;
    private double speed;
    private int crewNumber;

    public Spacecraft(String title, double speed, int crewNumber) {
        this.title = title;
        this.speed = speed;
        this.crewNumber = crewNumber;


    }

    @Override
    public String toString() {
        return title + '\'' +
                ", speed=" + speed +
                ", crewNumber=" + crewNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spacecraft that = (Spacecraft) o;
        return Double.compare(that.speed, speed) == 0 && crewNumber == that.crewNumber && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, speed, crewNumber);
    }
}

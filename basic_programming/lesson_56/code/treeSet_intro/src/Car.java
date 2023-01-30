import java.util.Objects;

public class Car implements Comparable<Car>{
    String title;
    double engineVolume;
    int maxSpeed;

    public Car(String title, double engineVolume, int maxSpeed) {
        this.title = title;
        this.engineVolume = engineVolume;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return String.format("%s %f %d", title, engineVolume, maxSpeed);
    }


    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.maxSpeed, o.maxSpeed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && maxSpeed == car.maxSpeed && Objects.equals(title, car.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, engineVolume, maxSpeed);
    }
}

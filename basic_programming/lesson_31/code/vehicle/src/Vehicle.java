public class Vehicle {
    private double speed;
    private int capacity; // вместимость
    private double weight;

    public double getSpeed() {
        return speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vehicle(double speed, int capacity, double weight) {
        this.speed = speed;
        this.capacity = capacity;
        this.weight = weight;
    }

    public Vehicle() {
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed" + speed +
                ", capacity=" + capacity +
                ", weight=" + weight +
                '}';
    }
}

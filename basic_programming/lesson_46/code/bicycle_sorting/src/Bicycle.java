public class Bicycle implements Comparable<Bicycle>{
    String title;
    private int numberOfGears;
    double maxSpeed;

    public Bicycle(String title, int numberOfGears, double maxSpeed) {
        this.title = title;
        this.numberOfGears = numberOfGears;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int compareTo(Bicycle o) {
//        return this.title.compareTo(o.title);
        return Integer.compare(this.numberOfGears, o.numberOfGears);
//        return Double.compare(this.maxSpeed, o.maxSpeed); // если бы хотели по максимальной скорости
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "title='" + title + '\'' +
                ", numberOfGears=" + numberOfGears +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

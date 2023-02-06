public class Cowboy implements Comparable<Cowboy> {
    private String name;
    private double gunsWeight;

    @Override
    public int compareTo(Cowboy o) {
        return -Double.compare(gunsWeight, o.gunsWeight);
    }

    public String getName() {
        return name;
    }

    public double getGunsWeight() {
        return gunsWeight;
    }

    public Cowboy(String name, double gunsWeight) {
        this.name = name;
        this.gunsWeight = gunsWeight;
    }

    @Override
    public String toString() {
        return String.format(" %s %.0f ", name, gunsWeight);
    }
}

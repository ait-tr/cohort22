public abstract class Waste {
    private String title;
    private double weight;
    private double volume;

    public void use() {
    }

    public String getTitle() {
        return title;
    }

    public Waste() {
    }

    public Waste(String title, double weight, double volume) {
        this.title = title;
        this.weight = weight;
        this.volume = volume;
    }
}

public abstract class Drink {
    private String title;
    private double volume;

    public String getTitle() {
        return title;
    }

    public double getVolume() {
        return volume;
    }

    public Drink(String title, double volume){
        this.title = title;
        this.volume = volume;
    }
}

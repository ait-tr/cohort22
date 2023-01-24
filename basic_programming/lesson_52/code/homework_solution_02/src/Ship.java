public class Ship {
    private String title;
    private boolean isDizel;
    private boolean hasTourbine;
    private int power;



    public int getPower() {
        return power;
    }

    public Ship(String title, boolean isDizel, boolean hasTourbine, int power) {
        this.title = title;
        this.isDizel = isDizel;
        this.hasTourbine = hasTourbine;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "title='" + title + '\'' +
                ", isDizel=" + isDizel +
                ", hasTourbine=" + hasTourbine +
                ", power=" + power +
                '}';
    }

    public double calculateCosts(){
        double fuel = (isDizel ? 60 : 70);
        double coefficient = hasTourbine? 1.3 : 1;
        return power * fuel * coefficient;
    }

}

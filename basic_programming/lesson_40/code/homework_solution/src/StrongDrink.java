public class StrongDrink extends Drink {
    private double alcoholContent;
    public StrongDrink(double alcoholContent, String title, double volume){
        super(title, volume);
        this.alcoholContent = alcoholContent;
    }
    public double getAlcoholContent(){
        return alcoholContent;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s %f",
                getTitle(),
                getVolume(),
                alcoholContent
                );
    }
}

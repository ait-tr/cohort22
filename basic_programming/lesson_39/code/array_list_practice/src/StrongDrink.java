public class StrongDrink extends Drink {
    private double alcoholContent;
    public StrongDrink(double alcoholContent, String title, double volume){
        super(title, volume);
        this.alcoholContent = alcoholContent;
    }


    @Override
    public String toString() {
        return "StrongDrink{" +
                "alcoholContent=" + alcoholContent +
                '}';
    }
}

public class SoftDrink extends Drink{
    private double sugarContent;
    public SoftDrink(double sugarContent, String title, double volume){
        super(title, volume);
        this.sugarContent = sugarContent;
    }

    @Override
    public String toString() {
        return "SoftDrink{" +
                "sugarContent=" + sugarContent +
                '}';
    }
}

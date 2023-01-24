public class Building {
    private String title;
    private int efficiency;
    private boolean isGas;

    public String getTitle() {
        return title;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public boolean getIsGas() {
        return isGas;
    }


    public Building(String title, int efficiency, boolean isGas) {
        this.title = title;
        this.efficiency = efficiency;
        this.isGas = isGas;
    }

    @Override
    public String toString() {
        return "Building{" +
                "title='" + title + '\'' +
                ", efficiency=" + efficiency +
                ", isGas=" + isGas +
                '}';
    }

    public double calculateHeatingCosts(){
        double priceOfFuel = (isGas ? 70 : 60);
        switch (efficiency){
            case 1: {
                return 20 * priceOfFuel;
            } case 2: {
                return 15 * priceOfFuel;
            } case 3: {
                return 13 * priceOfFuel;
            } case 4: {
                return 10 * priceOfFuel;
            } default:{
                return -1;
            }
        }

    }
}

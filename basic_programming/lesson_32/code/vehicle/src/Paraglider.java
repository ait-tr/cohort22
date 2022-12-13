public class Paraglider extends Vehicle {
    private double flyAltitude;
    private double wingsWidth;

    private double extra;

    public double getFlyHeights() {
        return flyAltitude;
    }

    public double getWingsWidth() {
        return wingsWidth;
    }

    public void setFlyAltitude(double flyAltitude) {
        this.flyAltitude = flyAltitude;
    }

    public void setWingsWidth(double wingsWidth) {
        this.wingsWidth = wingsWidth;
    }

//    public Paraglider(double flyAltitude){
//        if (flyAltitude == 2 || flyAltitude == 4 || flyAltitude == 9){
//            this.flyAltitude = flyAltitude;
//        } else {
//            this.flyAltitude = 4;
//        }
//    }

//    public Paraglider(double wingsWidth, double flyAltitude) {
//        this.wingsWidth = wingsWidth;
//        this.flyAltitude = flyAltitude;
//    }

//    public Paraglider(double wingsWidth, double flyAltitude, double extra) {
//        this(wingsWidth, flyAltitude); // отсылает к конструкторам этого класса
//        this.extra = extra;
//    }

    public Paraglider(double speed, int capacity, double weight,
                      double wingsWidth, double flyAltitude){
        super(speed, capacity, weight); // выбирает подходящий конструктор из родительского класса
        this.flyAltitude = flyAltitude;
        this.wingsWidth = wingsWidth;
    }

    @Override
    public String toString(){
        return String.format(
                "Paraglider speed: %.2f capacity: %d weight: %.2f width: %.2f altitude: %.2f",
                getSpeed(),
                getCapacity(),
                getWeight(),
                wingsWidth,
                flyAltitude
                );
    }


}

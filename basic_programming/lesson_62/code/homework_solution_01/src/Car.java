public class Car {
    String title;
    double tankVolume;
    Fuel fuel;

    public Car(String title, double tankVolume, Fuel fuel) {
        this.title = title;
        this.tankVolume = tankVolume;
        this.fuel = fuel;
    }

    public double calculateFullTankPrice(){
        return tankVolume * fuel.getPrice();
    }

    @Override
    public String toString() {
        return "Car{" +
                "title='" + title + '\'' +
                ", tankVolume=" + tankVolume +
                ", fuel=" + fuel +
                '}';
    }
}

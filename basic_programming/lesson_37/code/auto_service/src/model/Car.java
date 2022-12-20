package model;

public class Car extends Vehicle {
    private String numberPlate;
    private int year;
    private String brand;
    private String model;
    private Tire tire;

    public void setTire(Tire tire){
        this.tire = tire;
    }

    public Car(String numberPlate, int year, String brand, String model, Tire tire) {
        this.numberPlate = numberPlate;
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.tire = tire;
    }

    public String toString() {
        return String.format(
                "%s %s %d %s %s",
                brand,
                model,
                year,
                numberPlate,
                tire           // здесь автоматически вызовется метод toString()
        );
    }

}

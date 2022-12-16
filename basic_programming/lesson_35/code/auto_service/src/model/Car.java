package model;

public class Car {
    String numberPlate;
    int year;
    String brand;
    String model;
    Tire tire;

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
                tire  // здесь автоматически вызовется метод toString()
        );
    }

}

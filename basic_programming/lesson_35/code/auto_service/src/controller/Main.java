package controller;

import model.Car;
import model.Tire;


public class Main {
    public static void main(String[] args) {
        Tire micheline = new Tire(17, true, "Micheline XR-27-1812");
        System.out.println(micheline);

        Car mercedes = new Car(
                "btt1234",
                2022,
                "Mercedes",
                "E220",
                micheline
        );
        System.out.println(mercedes);

        Car gelek = new Car(
                "bnm1233",
                2020,
                "Mercedes",
                "gelentwagen",
                new Tire(22, true, "perelli")
        );
        System.out.println(gelek);
    }
}
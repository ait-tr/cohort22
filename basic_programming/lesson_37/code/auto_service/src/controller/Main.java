package controller;

import model.Car;
import model.Mechanic;
import model.Tire;
import model.Vehicle;

import java.util.Vector;


public class Main {
    public static void main(String[] args) {
        Tire micheline = new Tire(
                17,
                true,
                "Micheline XR-27-1812");
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
        System.out.println("_______");
        System.out.println(micheline.tireTypeToString());
        System.out.println("____instanceof___");
        // instanceof оператор при помощи которого
        // мы можем посмотреть, является ли объект(экземпляр) наследником какого-либо класса.
        int x = 9 + 6; // "=" - оператор присваивания, "+" математический оператор
        boolean y = 10 > 9;            // ">" - оператор сравнения. Приходят численные типы, возвращает boolean.
        boolean f = (10 > 9) && true;  // Оператор && - логический оператор. В него приходят два boolean, возвращает boolean

        "das".equals("sad");           // equals -  не оператор. Но возвращает boolean.
        // Это метод - в данном случае класса String. Методы можно переопределять.
        System.out.println(gelek instanceof Vehicle);
        System.out.println(gelek instanceof Car);      //
        System.out.println(micheline instanceof Tire);
        Vehicle vehicle1 = new Vehicle();
        System.out.println(vehicle1 instanceof Car);   // экземпляр класс Vehicle не является наследником класса Car

        //Мы можем узнать имя super класса с помощью метода getClass()
        System.out.println(gelek.getClass());

        System.out.println("_____change tire____");
        Mechanic semen = new Mechanic("Semen Semoynov", 0, 2, 4000);
        System.out.println("___before__tire_change__");
        System.out.println(gelek);
        semen.checkSalary();
        semen.changeTires(gelek, new Tire(22, false,"belshina"));
        System.out.println("___after__tire_change__");
        semen.checkSalary();
        System.out.println(gelek);
        System.out.println("___after_another_tire_change__");
        semen.changeTires(gelek, new Tire(22, false,"nokian"));
        semen.checkSalary();

    }
}
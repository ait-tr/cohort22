import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // Создайте класс велосипед с приватными полями numberOfGears, maxSpeed, title
        // в мейне создайте ArrayList с велосипедами и произвольно наполните его в хаотичном порядке.
        // И отсортируйте по максимальной скорости
        // после чего распечатайте

        ArrayList<Bicycle> bikes = new ArrayList<>();
        bikes.add(new Bicycle("linux", 3, 30));
        bikes.add(new Bicycle("stels", 1, 25));
        bikes.add(new Bicycle("bearbikes", 1, 45));
        bikes.add(new Bicycle("merida", 10, 35));
        System.out.println("До сортировки");
        for(Bicycle bike: bikes){
            System.out.println(bike);
        }
        Collections.sort(bikes);
        System.out.println("После сортировки");
        for(Bicycle bike: bikes){
            System.out.println(bike);
        }


    }
}
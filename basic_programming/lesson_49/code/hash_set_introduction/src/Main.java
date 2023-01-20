import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashSet<String> planets = new HashSet<>();
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Nubiru");
        planets.add("Saturn");
        planets.add("Venera");
        planets.add("Borrotorre");
        planets.add("Mercury");
        System.out.println(planets.size());
        planets.add("Mercury");
        System.out.println(planets.size());
//        planets.clear(); // убирает все
        System.out.println(planets.remove("Mars"));

        System.out.println(planets.contains("Mars")); // содержит ли объект

        System.out.println(planets.isEmpty());

        System.out.println(planets);

        ArrayList<String> planetsList = new ArrayList<>(planets);
        planetsList.add("Saturn");
        planetsList.get(2);
        System.out.println(planetsList);

        HashSet<String> planetsSet = new HashSet<>(planetsList);
        System.out.println(planetsSet);
        for (String planet : planetsSet) {
            System.out.println(planet);
        }
        String[] moonArr = new String[]{"Moon"};
        // напрямую добавить простой массив не получилось, пришлось преобразовать его используя List.of()
        // это метод создает лист из массива
        planets.addAll(List.of(moonArr));
        // addAll можно добавить значения из другого множества или листа, или коллекции
        System.out.println(planets);


    }


}
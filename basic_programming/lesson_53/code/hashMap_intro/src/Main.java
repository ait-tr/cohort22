import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> capitalsByCountry = new HashMap<>();
        capitalsByCountry.put("Russia", "Moscow");
        capitalsByCountry.put("Brazil", "Brazilia");
        capitalsByCountry.put("Burkinofaso", "Uugadudgu");
        capitalsByCountry.put("Germany", "Berlin");
        capitalsByCountry.put("France", "Paris");
        System.out.println(capitalsByCountry);
        capitalsByCountry.remove("Brazil");
        System.out.println(capitalsByCountry);
//        capitalsByCountry.clear(); //  удаляет всё
        capitalsByCountry.put("Russia", "Saint Petersburg");// что произойдет?
        System.out.println(capitalsByCountry);

        HashMap<String, String> capitals2 = new HashMap<>(capitalsByCountry);
        System.out.println(capitals2);
        capitals2.size();

    }
}
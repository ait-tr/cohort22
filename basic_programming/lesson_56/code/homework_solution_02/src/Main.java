import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Bar, Integer> ratesByBars = new HashMap<>();
        ratesByBars.put(new Bar<>("Blue lagoone", "Nord Bay Str 18", new Coffee(12, "Capuccino")), 9);
        ratesByBars.put(new Bar<>("Blue lagoone", "Nord Bay Str 18", new Coffee(12, "Capuccino")), 9);
        ratesByBars.put(new Bar<>("John Dillinger", "South Tea Str 18", new Tee(12, "Green tea")), 9);
        ratesByBars.put(new Bar<>("John Dillinger", "South Tea Str 18", new Tee(12, "Green tea")), 9);

        System.out.println(ratesByBars);

    }
}
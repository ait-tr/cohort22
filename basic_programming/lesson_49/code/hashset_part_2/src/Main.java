import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Spacecraft soyuz = new Spacecraft("Souyz", 30000, 3);
        Spacecraft shuttle = new Spacecraft("Apollo", 2500, 7);
        HashSet<Spacecraft> spacecrafts = new HashSet<>();
        spacecrafts.add(soyuz);
        spacecrafts.add(shuttle);
        System.out.println(spacecrafts);
        Spacecraft soyuz2 = new Spacecraft("Souyz", 30000, 3);
        spacecrafts.add(soyuz2);
        System.out.println(spacecrafts);
        System.out.println(soyuz.hashCode());
        System.out.println(soyuz2.hashCode());

    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dinosaur tRex = new Dinosaur("T-Rex", true, false, 3.6, "green");
//        System.out.println(tRex);

        Dinosaur pterodactyle = new Dinosaur("Pterodactyle", true, true, 2, "brown");
//        System.out.println(pterodactyle);

        Park jurassicPark = new Park(
                "Jurassic Park",
                new Dinosaur[]{
                        tRex,
                        pterodactyle,
                        new Dinosaur("Triceratops", false, false, 2.2, "yellow"),
                        new Dinosaur("Diplodocus", false, false, 4, "green")
                }
        );
        System.out.println(jurassicPark);
        System.out.println("____Looking___for__dino");
        System.out.println(jurassicPark.findDinoByName("T-Rex"));
        System.out.println(jurassicPark.findDinoByName("Stegosaurus"));
        System.out.println("________Get_one_by_color____________");
        System.out.println(jurassicPark.findFlyingDynoByColor("green"));
        System.out.println("________Print_all_by_color____________");
        jurassicPark.printAllByColor("brown");
        System.out.println("________Get_all_by_color____________");
        System.out.println(Arrays.toString(jurassicPark.getAllByColor("green")));
        System.out.println("______Add___dino___");
        jurassicPark.addDino(new Dinosaur("Spinosaurus", true, false, 5.4, "red"));
        System.out.println(jurassicPark);
        jurassicPark.removeDinoByName("T-Rex");
        System.out.println("____remove_by_name___");
        System.out.println(jurassicPark);
    }
}
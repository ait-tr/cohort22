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
        //
        System.out.println(jurassicPark.findFlyingDynoByColor("green"));

    }
}
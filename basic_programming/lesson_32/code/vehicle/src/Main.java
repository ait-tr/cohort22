public class Main {
    public static void main(String[] args) {
//        Car bmw = new Car();
//        System.out.println(bmw.getNumberOfWheels());
        Car maserati = new Car(
                true,
                4,
                320,
                2,
                1900);
        System.out.println(maserati);
        Bicycle speeder = new Bicycle();
        System.out.println(speeder);
        System.out.println("______");
        speeder.ride();
        speeder.ride(12, 1.0);
        speeder.ride(12.0,2);
        String text = "Heye";
        Paraglider pigeonStar = new Paraglider(75, 1, 20, 2, 1.7);
        System.out.println(pigeonStar);
//        Paraglider pigeon2 = new Paraglider(12);
    }
}
public class Main {
    public static void main(String[] args) {
        Butterfly mahagon = new Butterfly();
        mahagon.wingspan = 30;
        Butterfly.color = "brown";

        Butterfly silkworm = new Butterfly();
        Butterfly butterflyCabbage = new Butterfly();
        silkworm.wingspan = 3;

        Butterfly.color = "green";
        butterflyCabbage.wingspan = 2;
        Butterfly.setColor("yellow");

        System.out.println(mahagon);
        System.out.println(silkworm);
        System.out.println(butterflyCabbage);

        System.out.println(Butterfly.displayInfo(mahagon));

    }
}
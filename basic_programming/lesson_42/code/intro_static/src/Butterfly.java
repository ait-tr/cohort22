public class Butterfly {
    public double wingspan;        // размах крыльев
    public static String color;

    public final int wingsNumber;  // константа

    public Butterfly() {
        wingsNumber = 4;
    }

    ;

    public double getWingspan() {
        return wingspan;
    }

    public static void setColor(String color) {
        Butterfly.color = color;
    }

    public String toString() {
        return color + " " + wingspan;
    }

    public static String displayInfo(Butterfly butterfly) {
        return butterfly.getWingspan() + " " + color;
    }


}

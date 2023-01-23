public class Plate {  // кухонная тарелка
    String title;
    int diameter;
    String type;
    String color;

    public void displayInfo(){
        System.out.println(title + " " + diameter);
    }

    public Plate(String title, int diameter, String type, String color) {
        this.title = title;
        this.diameter = diameter;
        this.type = type;
        this.color = color;
    }
}

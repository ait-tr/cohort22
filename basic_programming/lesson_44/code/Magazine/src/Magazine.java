import java.util.ArrayList;

public class Magazine implements Printable{
    String title;
    @Override
    public void print() {
        System.out.println("Magazine " +title);
    }

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + title + '\'' +
                '}';
    }
    public static void printMagazines(ArrayList<Printable> printables){
        for(Printable element : printables){
            if (element instanceof Magazine){
                System.out.println(element);
            }
        }
    }
}

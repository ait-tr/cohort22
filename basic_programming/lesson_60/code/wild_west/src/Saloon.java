import java.util.PriorityQueue;

public class Saloon {
    PriorityQueue<Cowboy> cowboys;
    String title;

    public Saloon(String title) {
        this.title = title;
        cowboys = new PriorityQueue<>();
    }

    public void serveDrink() {
        if (cowboys.isEmpty()) {
            System.out.println("No one there!");
        } else {
            System.out.println(cowboys.poll().getName() + ", take your whiskey and get from here");
        }
    }

    public void letCowboyIn(Cowboy cowboy) {
        cowboys.offer(cowboy);
    }

    @Override
    public String toString() {
        return "Saloon{" +
                "cowboys=" + cowboys +
                ", title='" + title + '\'' +
                '}';
    }
}

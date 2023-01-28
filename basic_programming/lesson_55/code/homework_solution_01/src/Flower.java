public class Flower {
    private String title;
    private String color;

    public Flower(String title, String color) {
        this.title = title;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s %s", color, title);
    }
}

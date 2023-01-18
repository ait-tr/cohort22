public class Insect {
    private String title;
    private int numberOfEyes;
    private int numberOfWings;

    public String getTitle() {
        return title;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public Insect(String title, int numberOfEyes, int numberOfWings) {
        this.title = title;
        this.numberOfEyes = numberOfEyes;
        this.numberOfWings = numberOfWings;
    }

    @Override
    public String toString() {
        return "Insect{" +
                "title='" + title + '\'' +
                ", numberOfEyes=" + numberOfEyes +
                ", numberOfWings=" + numberOfWings +
                '}';
    }
}

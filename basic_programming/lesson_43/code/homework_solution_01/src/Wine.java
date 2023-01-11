public class Wine {
    private String title;
    private int serialNumber;
    private static int numberOfBottles;

    public Wine(String title) {
        this.title = title;
        numberOfBottles++;
        serialNumber = numberOfBottles;
    }

    @Override
    public String toString() {
        return title +
                " Serial Nr: " + serialNumber+
                "\nBottles in total: "
                + numberOfBottles;
    }
}

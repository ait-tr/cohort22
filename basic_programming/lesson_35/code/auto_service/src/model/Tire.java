package model;

public class Tire {
    private int radius;
    private boolean isSummer;
    private String title;

    public Tire(int radius, boolean isSummer, String title) {
        this.radius = radius;
        this.isSummer = isSummer;
        this.title = title;
    }

    public String toString() {
//        return title + " " + radius + " " + (isSummer ? "summer" : "winter");
        return String.format(
                "Tire: %s %s %s",
                title,
                radius,
                isSummer ? "summer" : "winter"
        );
    }

    public int getRadius() {
        return radius;
    }

    public boolean getIsSummer() {
        return isSummer;
    }

    public String getTitle() {
        return title;
    }


}

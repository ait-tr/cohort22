package ait.model;

public abstract class Place {
    private String title;
    private double rate;
    private int chairs;
    private double service;

    public String getTitle() {
        return title;
    }

    public double getRate() {
        return rate;
    }

    public int getChairs() {
        return chairs;
    }

    public double getService() {
        return service;
    }

    public Place(String title, double rate, int chairs, double service) {
        this.title = title;
        this.rate = rate;
        this.chairs = chairs;
        this.service = service;
    }

    @Override
    public String toString() {
        return "ait.model.Place{" +
                "title='" + title + '\'' +
                ", rate=" + rate +
                ", chairs=" + chairs +
                ", service=" + service +
                '}';
    }
}

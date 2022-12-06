package model;

public class Musician {
    private String firstName;
    private String secondName;
    private String genre;
    private String instrument;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getGenre() {
        return genre;
    }

    public String getInstrument() {
        return instrument;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Musician(String firstName, String secondName, String genre, String instrument, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.genre = genre;
        this.instrument = instrument;
        this.age = age;
    }

    public String toString() {
        return age + " лет, " + firstName + " " + secondName + ", " + instrument
                + ", " + genre + "\n";
    }
}

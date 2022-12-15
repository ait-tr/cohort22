package model;

public abstract class Person {
    protected String firstName;
    protected String secondName;

    public Person(String text) {
        String[] arrNames = text.split(" ");
        firstName = arrNames[0];
        if (arrNames.length > 1) {
            secondName = arrNames[1];
        }
    }

    public Person() {
    }

    public String toString() {
        return String.format("%s %s", firstName, secondName);
    }
}

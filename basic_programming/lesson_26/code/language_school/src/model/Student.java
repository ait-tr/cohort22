package model;

public class Student {
    private String firstName;
    private String secondName;

    public String getFirstName(){
        return this.firstName;
    }

    public String getSecondName(){
        return this.secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Student(){
    }

    public Student(String firstName) {
        this.firstName = firstName;
    }

    public Student(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String toString() {
        return this.firstName + " " + this.secondName.toUpperCase();
    }
}

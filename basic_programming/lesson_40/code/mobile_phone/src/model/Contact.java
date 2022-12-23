package model;

public class Contact {
    private String name;
    private String number;
    public Contact(String name, String number){
        this.name = name;
        this.number = number;
    }
    public String toString(){
        return name + " " + number;
    }




}

package model;

public class Contact {
    private String name;        // имя контакта
    private String number;      // номер его телефона

    @Override
    public String toString() {
        return String.format("%s %s", name, number);
    }


    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }
}

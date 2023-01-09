package model;

import java.util.ArrayList;

public class Telephone {
    private String number;                  // номер телефона
    private String brand;                   // марка
    private String model;                  // модель
    private ArrayList<Contact> contacts;   // список контактов

    @Override
    public String toString() {
        return String.format("%s %s %s %s", brand, model, number, contacts);
    }

    public Telephone(String number, String brand, String model) {
        this.number = number;
        this.brand = brand;
        this.model = model;
        this.contacts = new ArrayList<>();  // заменили null
        contacts.add(new Contact("Emergency service", "112"));
        contacts.add(new Contact("Police", "110"));
    }

    public Telephone() {
    }

    public void addContact(String name, String number) {
        contacts.add(new Contact(name, number));
    }

    public void removeContactByName(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (name.equals(contacts.get(i).getName())) {
                contacts.remove(i--); // post-decrement, у нас еще есть increment и pre-decrement и т.д.
            }
        }
    }

}

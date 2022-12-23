package controller;

import model.Contact;
import model.Telephone;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Contact> contacts =  new ArrayList<>();
        contacts.add(new Contact("Vova", "+4912312312312"));
        contacts.add(new Contact("Galya", "+4931231231233"));
        Telephone nokia = new Telephone(
                "+491231231231231",
                "nokia",
                "3310",
                contacts
                );
        System.out.println(nokia);
        //nokia.addContact("Sveta", "+491231231312");

        System.out.println(String.format("%s %%", "Bobob"));// если хотим вывести % в format, экранируем еще одним %

    }
}
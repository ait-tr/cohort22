package controller;

import model.Telephone;

public class Main {
    public static void main(String[] args) {
        Telephone iphone = new Telephone("+49 2131 1231 123", "iphone", "XR");
        System.out.println(iphone);
        iphone.addContact("Vasiliy", "+49 1514 2312 123123");
        System.out.println(iphone);
        iphone.removeContactByName("Police");
        System.out.println(iphone);
    }

//    ##  Homework
//
//### Задание 1
//
//            #### Релиз 0
//    + Создайте пакеты модель и контроллер.
//    + Создайте класс телефон со следующими полями:
//    + номер телефона владельца number, "+49 865 123 12 12"
//    + марка(например, "Iphone"),
//    + модель(например, "12 Pro Max"),
//    + контакты(тип ArrayList<model.Contact>).
//
//    Создать класс model.Contact, в котором следующие поля:
//    + номер телефона,
//    + имя.
//
//    В классах пропишите toString.
//
//    Создайте объект класса телефон с контактами.
//
//            #### Релиз 1
//
//    Создать для класса телефон методы:
//    метод public void - добавить контакт. Например, nokia.addContact("Sveta", "+491231231312"),
//    метод удалить контакт по имени removeContactByName,
//    найти номер телефона по имени getNumberByName.
//
}
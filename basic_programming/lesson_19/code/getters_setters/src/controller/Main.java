package controller;

import model.Programmer;

public class Main {
    public static void main(String[] args) {
        // getters_setters
        Programmer andrew = new Programmer();
        andrew.firstName = "Andrew";
        andrew.secondName = "Garfield";
        andrew.age = 26;
        andrew.hello();


        Programmer vasya = new Programmer(2, "Vasya", "Kim", 9, 5000 );
        vasya.hello();
        // использовали getter, чтобы получить данные
        System.out.println(vasya.getSalary());
        // используем setter, чтобы изменить данные
        // у васи увеличилась зарплата
        vasya.setSalary(5500);
        System.out.println(vasya.getSalary());
        // увеличили зарпалату на процент
        vasya.setSalary(vasya.getSalary()*1.05); // повысили зп
        System.out.println(vasya.getSalary());
    }
}
package controller;

import model.Student;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student roman = new Student("Roman");
        System.out.println(roman.getFirstName());
        Student vova = new Student("Vova");
        System.out.println(vova.getFirstName());
        System.out.println(roman.getFirstName());
        Student olga = new Student("Olga", "Snowdy");
        System.out.println(olga.getFirstName());
        System.out.println(olga); // автоматически вызывается
        System.out.println(olga.getSecondName());
    }
}
package controller;

import model.Doctor;
import model.MyDate;
import model.Patient;

public class Main {
    public static void main(String[] args) {
        MyDate specialDate = new MyDate(15, 12, 2022);
        System.out.println(specialDate);
        Patient michael = new Patient(
                46,
                "Подскользнулся на лыжах, теперь нога болит.",
                new MyDate(16, 12, 2022),
                true,
                "Michael Schumacher"
        );


        System.out.println(michael);
        Doctor drHouse = new Doctor(
                "killing people with medicine",
                7,
                "Gregory House");
        drHouse.tread(michael);
        System.out.println(michael);

//        System.out.println(x);
//        System.out.println(michael.getDateOfCheckOut());
        // Создайте класс Doctor.
        // С полями: специальность, опыт.
        // Чтобы он наследовал класс Person
        // Напишите конструктор с super
        // Создайте метод treat, который принимает объект пациент и
        // Пусть этот метод проставляет пациенту диагноз
        // "Ушиб верхнего изгиба нижней полости мочевины,
        // лечить приемом ибупрофена по 6 таблеток перед сном"
        // и ставит дату выписки на следующий день от даты поступления.
        // drHouse.tread(michael);
        // public void tread(Patient patient){
        // и дальше через сеттеры
        // patient.setTreatment("здесь указываете лечение")
        //
    }
}
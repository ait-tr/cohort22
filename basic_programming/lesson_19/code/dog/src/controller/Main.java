package controller;

import model.Dog;

public class Main {
    public static void main(String[] args) {
        // creating new instances of Dog // создаем новые экземпляры класса Dog
        Dog bobby = new Dog(); // создали экземпляр и сохранили в переменную
        System.out.println(bobby.age);  // пока лежит 0
        System.out.println(bobby.name); // там лежат значения по умолчанию
        bobby.name = "Bobby"; // заполняем поля экземпляра
        bobby.age = 5;
        bobby.breed = "french bulldog";
        bobby.weight = 10;
        bobby.isAgressive = false;
        bobby.isMale = true;
        bobby.displayDog();
        // more dogs // constructor function
        Dog rex = new Dog("Rex");
        rex.displayDog();
        //
        Dog tuzik = new Dog("Tuzik", 16);
        tuzik.displayDog();
        //
        Dog kusya = new Dog("Kusya", 3, 8, false, false, "layka");
        kusya.displayDog();
        kusya.weight = 9;
        // напишите конструктор для 3 параметров name, age, weight
        // создайте собаку при помощи этого конструктора
        Dog sharik = new Dog("Sharik", 30, 30.5);
        sharik.isMale = true;
        sharik.displayDog();
    }
}
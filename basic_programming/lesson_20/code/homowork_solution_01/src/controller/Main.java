package controller;

import model.Chicken;

public class Main {
    public static void main(String[] args) {
        Chicken defaultChicken = new Chicken();
        defaultChicken.info();
        Chicken kurica = new Chicken("Kurica", 2, false, 20);
        kurica.info();
        Chicken petya = new Chicken("Petya", 8, true, 40);
        petya.info();
        Chicken cipa = new Chicken("Cipa", 3, false, 15);
        cipa.info();
        Chicken king = new Chicken("King", 4, true);
        king.info();
        System.out.println(king.getPrice()); // узнали стоимость короля
        king.setPrice(4); // изменили стоимость короля - задали новую цену
        System.out.println(king.getPrice()); // смотрим
        king.setPrice(king.getPrice() * 1.2); // увеличили на 20 процентов от старой стоимости
        System.out.println(king.getPrice()); // смотрим
        // создадим цыпленка бегуна
        Chicken useinBolt = new Chicken("Usein Bolt", 5, true);
        useinBolt.info();
        useinBolt.run();
        useinBolt.info();
        useinBolt.eatWorms(20); // 20 червяков за обед
        useinBolt.info();
    }
}
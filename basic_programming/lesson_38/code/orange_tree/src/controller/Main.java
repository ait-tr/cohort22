package controller;

import model.Farmer;
import model.OrangeTree;

public class Main {
    public static void main(String[] args) {
        // посадили дерево
        OrangeTree orangeTree = new OrangeTree();
        System.out.println(orangeTree); // посмотрели

        orangeTree.passGrowingSeason();
        orangeTree.passGrowingSeason();
        orangeTree.passGrowingSeason();
        orangeTree.passGrowingSeason();
        orangeTree.passGrowingSeason();
        orangeTree.passGrowingSeason();
        orangeTree.passGrowingSeason();

        Farmer johanes = new Farmer("Johanes");
        System.out.println(johanes.countAverageOrangeDiameter(orangeTree));
        // запускаем метод 50 раз
//        for(int i =0; i < 110; i++ ){
//            orangeTree.passGrowingSeason(); // вызываем
//            System.out.println(orangeTree);
//        }
    }
}
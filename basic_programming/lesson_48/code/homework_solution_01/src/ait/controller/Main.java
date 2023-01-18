package ait.controller;
import ait.comparators.*;
import ait.model.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Bar("Blue lagoone", 3,48,7));
        places.add(new Caffe("Choco Barocco", 7, 20, 8));
        places.add(new Restaurant("Smoke BBQ", 9,70, 8));
        places.add(new Bar("ait.model.Bar 69", 8, 20, 9));

        for(Place pl: places){
            System.out.println(pl);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите основание для сравнения: 1. по имени 2. по рейтингу");
        int answer = 1;
        try{
            answer = scanner.nextInt();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            scanner.close();
        }
        switch (answer){
            case 1:{
                places.sort(new PlacesByNameComparator());
                break;
            } case 2:{
                Collections.sort(places, new PlacesByRateComparator().reversed());
                break;
            }
        }
        System.out.println("После сортировки");
        for(Place pl: places){
            System.out.println(pl);
        }


      /*
      Создать абстрактный класс точка питания ait.model.Place с полями:
а) рейтинг double rate,
б) название title,
в) int chairs - количество посадочных мест,
г) double service - уровень сервиса по десятибалльной шкале.
Создайте производные классы ait.model.Restaurant, ait.model.Caffe, ait.model.Bar.
Создайте лист из объектов этих классов.
И реализуйте в main сортировку по всем этим полям (нужно написать 3 компаратора)
Можете использовать сканер для выбора компаратора.
       */


    }
}
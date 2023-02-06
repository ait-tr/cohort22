import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       /*
       Создайте класс скрипка. Пусть у скрипки будут поля:
        - String имя мастера,
        - LocalDate дата производства

        Создайте в Майне метод, который должен принимать произвольное число скрипок и возвращать имя мастера самой старой скрипки из переданных.
        То есть метод должен бытия статическим и возвращать String.
*/
        //  Некоторые методы класса LocalDate
//        LocalDate date1 = LocalDate.of(2023, 02, 03);
//        LocalDate date2 = LocalDate.of(2023, 02, 04);
//        System.out.println(date2.compareTo(date1));
//        Integer a = 1;
//        Integer b = 2;
//        System.out.println(b.compareTo(a));
//        System.out.println(date2.isAfter(date1));
//        System.out.println(date2.isBefore(date1));
//        System.out.println(date2.isLeapYear());

        String oldestMaster = getMasterNameOfOldestViolin3(
                new Violin("Stradivari", LocalDate.of(1710, 12, 13)),
                new Violin("Stradivari", LocalDate.of(1712, 12, 13)),
                new Violin("Devil", LocalDate.of(1380, 12, 13)),
                new Violin("Ivan Botov", LocalDate.of(1812, 12, 13))
                );
        System.out.println(oldestMaster);


    }
    public static String getMasterNameOfOldestViolin(Violin...violins){
        TreeSet<Violin> violinsSet = new TreeSet<>(new Comparator<Violin>() {
            @Override
            public int compare(Violin o1, Violin o2) {
                return -o1.getDateOfManufactoring().compareTo(o2.getDateOfManufactoring());
            }
        });
        Collections.addAll(violinsSet, violins);
        return violinsSet.last().getMasterName();
    }
    public static String getMasterNameOfOldestViolin2(Violin...violins){
        String master = violins[0].getMasterName();
        LocalDate date = violins[0].getDateOfManufactoring();
        for(int i =1; i<violins.length; i++){
            if(violins[i].getDateOfManufactoring().isBefore(date)){
                date = violins[i].getDateOfManufactoring();
                master = violins[i].getMasterName();
            }
        }
        return master;
    }
    public static String getMasterNameOfOldestViolin3(Violin...violins){
        PriorityQueue<Violin> violinsPQ = new PriorityQueue<>(new Comparator<Violin>() {
            @Override
            public int compare(Violin o1, Violin o2) {
                return o1.getDateOfManufactoring().compareTo(o2.getDateOfManufactoring());
            }
        });
        for (Violin violin:violins){
            violinsPQ.add(violin);
        }
        return violinsPQ.element().getMasterName();
    }
/*
 Представим, что мы попали на дикий запад.
 Нам нужно написать приложение для описания салуна.
 Создайте класс Cowboy с полем имя и полем gunsWeight;

 Создать класс салун Saloon, у него должны быть поле название
 и поле типа PriorityQueue<Cowboy> cowboys
 у салон должны быть следующие методы:
 - serveDrink()  ничего не принимает и выводит в печать имя ковбоя с самым большим пистолетом
 "Robbie Gonzales, take your whiskey and get from here" - выгоняет ковбоя
 - letCowboyIn(Cowboy cowboy) - впускает ковбоя в салон
 */



}
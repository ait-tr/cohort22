public class Main {
    public static void main(String[] args) {
        /*
 Представим, что мы попали на дикий запад.
 Нам нужно написать приложение для описания салуна.
 Создайте класс Cowboy с полем имя и полем gunsWeight;

 Создать класс салун Saloon, у него должны быть поле название
 и поле типа PriorityQueue<Cowboy> cowboys
 у салона должны быть следующие методы:
 - serveDrink()  ничего не принимает и выводит в печать имя ковбоя с самым большим пистолетом
 "Robbie Gonzales, take your whiskey and get from here" - выгоняет ковбоя
 - letCowboyIn(Cowboy cowboy) - впускает ковбоя в салон
 */

        Saloon wildWest = new Saloon("Wild wild west");
        wildWest.letCowboyIn(new Cowboy("Single Eye Joe", 1500));
        wildWest.letCowboyIn(new Cowboy("Kid Johnny", 600));
        wildWest.letCowboyIn(new Cowboy("Dirty Billy", 1200));
        wildWest.letCowboyIn(new Cowboy("Clumsy Bob", 2000));
        System.out.println(wildWest);
        wildWest.serveDrink();
        wildWest.serveDrink();
        wildWest.serveDrink();
        System.out.println(wildWest);
        wildWest.letCowboyIn(new Cowboy("Clumsy Bob", 2000));
        wildWest.serveDrink();
        wildWest.serveDrink();
    }
}
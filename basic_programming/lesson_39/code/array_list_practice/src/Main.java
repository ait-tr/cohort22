import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SoftDrink juice = new SoftDrink(11, "Rich", 2);
        StrongDrink vodka = new StrongDrink(40, "Vodka", 1.5);
        ArrayList<Drink> drinksArrList = new ArrayList<>();
        drinksArrList.add(vodka);
        drinksArrList.add(juice);
        System.out.println(drinksArrList);
    }

    /*
    Создайте базовый класс Drink
          title;
          volume;
    Создайте производный класс SoftDrink
          sugarContent; Указать сколько процентов сахара, например 5.
    Создайте производный класс StrongDrink
          alcoholContent; Например 30 // процентов крепости

    Создать ArrayList и добавить туда несколько экземпляров напитков.
     */
}
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    /*
    Создайте в main ArrayList<StrongDrink> состоящий
    из объектов класса StrongDrink, назовите его miniBar.
    Например в нашем miniBar будут водка, коньяк, вино,
    мартини, шампанское.
    Напишите в классе Main метод public static void
    filterDrinksStrongerThan20 - метод должен принимать в себя
    в качестве параметра ArrayList, и оставлять только напитки,
    содержание алкоголя в которых больше 20.
    Остальные напитки удаляются из ArrayList.
     */
        ArrayList<StrongDrink> miniBar = new ArrayList<>();
        System.out.println(miniBar); // пустой
        miniBar.add(new StrongDrink(37.5, "vodka", 0.5));
        miniBar.add(new StrongDrink(13, "wine", 0.75));
        miniBar.add(new StrongDrink(13, "wine", 0.75));
        miniBar.add(new StrongDrink(13, "wine", 0.75));
        miniBar.add(new StrongDrink(35, "konjak", 0.5));
        miniBar.add(new StrongDrink(13, "martini", 0.9));
        miniBar.add(new StrongDrink(10, "champagne", 0.75));
        System.out.println(miniBar); // наполнили алкоголем
        Main.filterDrinksStrongerThan20ver3(miniBar);
        System.out.println(miniBar);


        // вызовы методов
        //     semen.method();    можно вызвать от конкретного объекта
        //     Mechanic.method(); вызов метода от класса, метод должен быть static
        //     method();  вызов метода внутри класса

    }

    public static void filterDrinksStrongerThan20(ArrayList<StrongDrink> drinks) {
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).getAlcoholContent() < 20) {
                drinks.remove(i--);
            }
        }
    }

    public static void filterDrinksStrongerThan20ver2(ArrayList<StrongDrink> drinks) {
        for (int i = drinks.size() - 1; i >= 0; i--) {
            if (drinks.get(i).getAlcoholContent() < 20) {
                drinks.remove(i);
            }
        }
    }

    public static void filterDrinksStrongerThan20ver3(ArrayList<StrongDrink> drinks) {
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(drinks.size() - i - 1).getAlcoholContent() < 20) {
                drinks.remove(drinks.size() - i - 1);
                i--;
            }
        }
    }

}

//[vodka 0.5 37,500000, konjak 0.5 35,000000, champagne 0.75 10,000000]
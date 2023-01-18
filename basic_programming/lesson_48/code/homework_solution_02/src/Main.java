import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Apricot apricot = new Apricot(1);
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple(1));
        fruits.add(new Pear(1));
        System.out.println(Fruit.totalCostOfFruits);
//        System.out.println(Apple.getTotalPrice());
//        System.out.println(Pear.getTotalPrice());
        System.out.println(
                Apple.getTotalPrice() + Pear.getTotalPrice()
                +Apricot.getTotalPrice()
        );
    }


}
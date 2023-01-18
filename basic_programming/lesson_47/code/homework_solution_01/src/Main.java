import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Создайте абстрактный класс товар Product и два производных класса: мебель и алкоголь.
        // Пусть у класса товар будет два поля price и title.
        // Создайте в main лист продуктов. Добавьте туда произвольных продуктов.
        // И отсортируйте этот лист по title в обратном порядке( т.е. чтобы продукты расположились не по алфавиту, а наоборот от Z до A)
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Furniture("Table", 200));
        products.add(new Alcohol("Wine", 240));
        products.add(new Furniture("King's sofa", 1500));
        products.add(new Alcohol("Royal brandy", 2000));
        products.add(new Alcohol("Proper Twelve", 200));
        System.out.println("До сортировки:");
        for(Product pr:products){
            System.out.println(pr);
        }
        Collections.sort(products);
        System.out.println("После сортировки:");
        for(Product pr:products){
            System.out.println(pr);
        }
    }
}
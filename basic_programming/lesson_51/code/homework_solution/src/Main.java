import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<Car> cars = new HashSet<>();
        cars.add(new Car("Porsche",2022, "911", "metalic green"));
        cars.add(new Car("Mercedes", 2019, "AMG", "black"));
        cars.add(new Car("bmw", 2022, "dfs", "white"));
        cars.add(new Car("Opel", 2018, "Astra", "yellow"));
        cars.add(new Car("Opel", 2018, "Astra", "yellow"));

        Iterator<Car> iterator = cars.iterator();
        // фильтр по имени
        while(iterator.hasNext()){
            if("AMG".equalsIgnoreCase(iterator.next().getModel())){
                iterator.remove();
            }
        }
        // фильтрация по году выпуска
        Iterator<Car> iterator2 = cars.iterator();
        while (iterator2.hasNext()){
            if(iterator2.next().getYear() <= 2019){
                iterator2.remove();
                // break; // - если бы написали - он бы удалил только первый подходящий элемент
            }
        }
        // удалим по объекту Car, без equals так сделать не получится
        Iterator<Car> iterator3 = cars.iterator();
        while(iterator3.hasNext()){
            if(iterator3.next().equals(new Car("bmw", 2022, "dfs", "white"))){
                iterator3.remove();
            }
        }
        System.out.println(cars);
        //
        String a = "hello"; // если мы точно знаем, что не null, то ставим слева от equals
        String b = null;    // чтобы избежать NullPointerException
        System.out.println(a.equals(b));


    }
}
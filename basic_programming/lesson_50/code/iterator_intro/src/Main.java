import java.util.*;

public class Main {
    public static void main(String[] args) {
        // листы list
        ArrayList<String> hamsters = new ArrayList<>();
        LinkedList<String> pandas = new LinkedList<>();
        Vector<String> hamsters2 = new Vector<>();       // никогда не используется
        List<String> planets2 = new ArrayList<>();        // не можем сделать объект листа
        // множества set
        HashSet<String> spiders = new HashSet<>();
        //
        // iterator
        HashSet<String> planets = new HashSet<>();
        planets.add("Mars");
        planets.add("Pluto");
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        System.out.println(planets);
        Iterator<String> iterator1 = planets.iterator(); // получили объект итератор, сохранили его в переменную

        while (iterator1.hasNext()) {
            if (iterator1.next().equals("Pluto")) {
                iterator1.remove();
                break;
            }
            System.out.println("x");
        }
        System.out.println(planets);

        // выведите в консоль числа от 10 до 30, используя цикл while


    }
}
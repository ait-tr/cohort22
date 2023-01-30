import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        Создайте метод, который будет переносить все не-общие элементы из в двух листов в новый set.
//        (То, что в теории множеств называется симметрическая разность)
//        Напишите тест JUnit

        List<Panda> pandas1 = new ArrayList<>(List.of(
                new Panda("Po", 23),
                new Panda("Boo", 25),
                new Panda("Ro", 15)));
        List<Panda> pandas2 = new ArrayList<>(List.of(
                new Panda("Po", 23),
                new Panda("Pica", 25),
                new Panda("Min", 15)));
        System.out.println(getSymmetricDifference(pandas1, pandas2));
    }

    public static Set<Panda> getSymmetricDifference(List<Panda> list1, List<Panda> list2) {
        Set<Panda> result = new HashSet<>(list1);
        for (Panda panda : list2) {
            if (result.contains(panda)) {
                result.remove(panda);
            } else {
                result.add(panda);
            }
        }
        return result;
    }
}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
        Создайте класс Panda с несколькими полями.
        Создайте ArrayList<Panda> - чтобы панды в нем повторялись.
        Организовать подсчет повторений панд, сколько вхождений в ArrayList.
 */
        Panda anatoliy = new Panda("Anatoliy", 180, 36);
        System.out.println(anatoliy.hashCode() + " старый хэш");
        ArrayList<Panda> pandas = new ArrayList<>(List.of(
                new Panda("Johathan", 200, 36),
                new Panda("Arkadiy", 200, 36),
                anatoliy,
                new Panda("Anatoliy", 200, 36),
                new Panda("Kite", 200, 36),
                new Panda("Arkadiy", 200, 36),
                new Panda("Anatoliy", 200, 36)
        ));
        System.out.println(pandas);
        HashMap<Panda, Integer> pandaIntegerHashMap = new HashMap<>();
        for (Panda panda : pandas) {
            if (!pandaIntegerHashMap.containsKey(panda)) {
                pandaIntegerHashMap.put(panda, 1);
            } else {
                int value = pandaIntegerHashMap.get(panda) + 1;
                pandaIntegerHashMap.put(panda, value);
            }
        }
        System.out.println(pandaIntegerHashMap);
        // до мутации ключа
        System.out.println(pandaIntegerHashMap.get(anatoliy));
        anatoliy.setAge(48); //  мутировали ключ
        System.out.println(pandaIntegerHashMap.get(anatoliy));
        // и теперь не можем достать по этому ключу значение - потому что изменился hashCode
        System.out.println(pandaIntegerHashMap.keySet());
        for (Panda panda : pandaIntegerHashMap.keySet()) {
            System.out.println(panda.hashCode());
        }
        System.out.println(pandaIntegerHashMap.get(new Panda("Anatoliy", 180, 36)));
    }
}
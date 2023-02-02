import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*

        Дана строка произвольной длины, слова разделены запятой с пробелом. "Иван, Галина, Маша, Сара, Галина, Маша, Игорь, Миша".

        Организовать подсчет того, сколько раз повторилось каждое из имен. Используйте для этого какую-нибудь реализацию Map.
         */

        String text = "Иван, Галина, Маша, Сара, Галина, Маша, Игорь, Миша";
        String[] names = text.split(", ");
        // вариант 2
        HashMap<String, Integer> namesMap = new HashMap<>();
        for (String name : names) {
            Integer previousValue = namesMap.getOrDefault(name, 0);
            namesMap.put(name,  previousValue + 1);
            //ниже вариант 2
//            if (!namesMap.containsKey(name)){
//                namesMap.put(name, 1);
//            } else {
//                Integer counter = namesMap.get(name)+1;
//                namesMap.put(name, counter);
//            }
        }
//         вариант 1
//        HashSet<String> namesSet = new HashSet<>(List.of(names));
//        HashMap<String, Integer> countsByNames = new HashMap<>();
//        for(String name: namesSet){
//            countsByNames.put(name, 0);
//        }
//        for(String name: names){
//            int count = countsByNames.get(name)+1;
//            countsByNames.put(name, count);
//        }


//        System.out.println(countsByNames);


    }
}
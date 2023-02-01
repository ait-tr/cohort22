import java.util.*;


public class Main {
    public static void main(String[] args) {
        String input = "конь мухомор курица сундук конь курица пшено ячмень река конь река река река";
        String[] words = input.split(" ");
        //  конь - 3, мухомор - 1, курица - 2 ...

        HashMap<String, Integer> wordsMap = new HashMap<>();
        for(String word : words){
            if(!wordsMap.containsKey(word)){
                wordsMap.put(word, 1);
            } else {
                wordsMap.put(word, wordsMap.get(word)+1);
            }
        }
        System.out.println(wordsMap);

        TreeMap<String, Integer> wordsMap2 = new TreeMap<>();
        Set<String> result = new TreeSet<>(List.of(words));
        for(String key: result){
            wordsMap2.put(key, Collections.frequency(List.of(words), key));
        }
        System.out.println(wordsMap2);


        // Первый самый долгий вариант
//        HashSet<String> wordsSet = new HashSet<>(List.of(words));
//        System.out.println(wordsSet);

//        HashMap<String, Integer> countsByWords = new HashMap<>();
//        for(String word: wordsSet){
//            countsByWords.put(word, 0);
//        }
//        System.out.println(countsByWords);
//
//        for(String word:words){
//            System.out.println(word);
//            int count = countsByWords.get(word)+1;
//            countsByWords.put(word, count);
//        }
//        System.out.println(countsByWords);


    }
}
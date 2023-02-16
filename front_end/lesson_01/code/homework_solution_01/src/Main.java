import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     /*
     Создайте функциональный интерфейс, который принимает некоторый символ
     String и также принимает Varargs String.
     Сделайте реализацию, которая возвращает самую
     длинную строку из переданных, которая начинается с указанного символа.
      */
        StringProcessor stringProcessor = (symbol, words) -> {
            String temp = "";
            for (int i = 0; i < words.length; i++) {
                if (words[i].startsWith(symbol)) {
                    if (words[i].length() > temp.length()) {
                        temp = words[i];
                    }
                }
            }
            if (temp.isEmpty()) {  // isBlank()
                return null;
            }
            return temp;
        };
        String res = stringProcessor.process(
                "B", "amp", "guitar", "Bob", "Bobby");
        System.out.println(res);

        // второй вариант на компараторе-лямбде. Очень сложно - для демонстрации
        StringProcessor stringProcessor2 = (symbol, words) -> {
            ArrayList<String> wordsList = new ArrayList<>(List.of(words));
            Collections.sort(wordsList, (a, b) -> {
                if (a.startsWith(symbol) && !b.startsWith(symbol)) {
                    return 1;
                } else if (!a.startsWith(symbol) && b.startsWith(symbol)) {
                    return -1;
                } else if (a.startsWith(symbol) && b.startsWith(symbol)) {
                    return Integer.compare(a.length(), b.length());
                } else {
                    return 0;
                }
            });
            return wordsList.get(wordsList.size()-1);
        };

        String result2 = stringProcessor2.process("B", "Bobby", "Bob", "Lob", "John");
        System.out.println(result2);

    }
}
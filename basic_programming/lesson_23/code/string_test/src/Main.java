import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // опрос на тему char и методы класса String
        char[] arrOfChars = {'H', 'e', 'l','l',' ', 'Y', 'e', 'h', 'e'};
        String text = String.valueOf(arrOfChars); // первый способ объединить чары в String
        System.out.println(text);
        String text2 = new String(arrOfChars);    // второй способ объединить чары в String
        System.out.println(text2);

        int[] arr = {2, 8, 9, 10};
        System.out.println(arr[2]);

        String word = "Heaven";
        System.out.println(word.charAt(3));

        String word2 = word.replaceAll("ea", "**");
        System.out.println(word2);

        String phrase = (word + " ").repeat(10);
        System.out.println(phrase);
        // repeat - создает новую строку повторяя исходную указанное количество раз
        System.out.println("*".repeat(20));
        // split - если нужно разделить строку - метод возвращает нам String[]
        String phrase2 = "Christmas is coming, soon it will be in the town";
        String[] arr2 = phrase2.split(" ");
        // Arrays.toString() создаст строку из массива - в одну строку через запятые и в квадратных скобках
        System.out.println(Arrays.toString(arr2)); //
        // substring возвращает новую строку, которая является фрагментом исходной
        String fragment = phrase2.substring(3,9); // istmas
        System.out.println(fragment);

        String fragment2 = phrase2.substring(3); // istmas is coming, soon it will be in the town
        System.out.println(fragment2);
        // как объединить String[] в один String
        // метод
        String joinedPhrase = String.join(" ", arr2); // объединили массив строк в одну строку, через разделитель
        System.out.println(joinedPhrase);
        // toUpperCase() если нужно изменить регистр - все написать большими буквами
        System.out.println(joinedPhrase.toUpperCase()); //
        // toLowerCase() чтобы перевести в нижний регистр
        System.out.println(joinedPhrase.toLowerCase());
        // Чем отличается char от Character
        char a1 = 'a';
        Character a2 = 'a';
        String x = a2.toString();
        System.out.println(a2.equals(a1)); // так работает
        // а вот так будет ошибка a1.equals(a2);
        // для чаров используем ==
        // для String используем .equals()
    }
}
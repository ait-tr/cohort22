import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // split
       String str1 = "Long and boring sentence";
       String [] words = str1.split(" ");
       printArr(words);
       String str2 = "Anny--has--little-lamb";
       String [] words2 = str2.split("--"); // в скобочках разделитель
       printArr(words2);
       String word3 = "People";
       String[] words4 = word3.split("e");
       printArr(words4);
       // метод для замены replaceAll
       String phrase1 = "Good evening, foes";
       String phrase2 = phrase1.replaceAll("foes", "friends");
        System.out.println(phrase2);
        // метод для вырезания куска из строки substring
        String phrase3 = "Sun is going down";
        String phrase4 = phrase3.substring(4);
        System.out.println(phrase4);
        // индекс начала(включительно) и индекс конца(не включительно)
        String phrase5 = phrase3.substring(4, 6);
        System.out.println(phrase5);
        // concat объединение строк
        String phrase6 = phrase1.concat(phrase3); // объединяем строки
        System.out.println(phrase6);
        // делаем строку из массива char
        char[] symbols = {'H', 'e','l', 'l', ',', ' ', 'Y', 'e', 'h'};
        String phrase7 = new String(symbols); // создаем из char строку
        System.out.println(phrase7);
        String phrase8 = String.valueOf(symbols); // второй способ из чаров
        System.out.println(phrase8);
        // задание
        String phrase9 = "Anny--has--little--lamb";
        String [] words3 = str2.split("--"); // в скобочках разделитель
        printArr(words3);
        // метод который бы принимал массив слов - и объединял их через пробел
        // возвращал объединенную строку
        // назовите его joinArray
        // [Anny, has, little-lamb] - принимает какой-то массив
        //  Anny has little-lamb - возвращает строку
        String[] words5 = {"It's", "raining", "outside", "you'd better", "take", "an", "umbrella"};
        printArr(words5);
        String result = joinArray(words5, "__");
        System.out.println(result);
        // метод String.join(<разделитель>, <массив строк>)
        String result2 = String.join("++", words5); //
        System.out.println(result2);
    }
    public static String joinArray(String[] arr, String delimeter) {
        String acc = arr[0];
        for(int i = 1; i < arr.length; i++) {
            acc = acc + delimeter + arr[i];
            System.out.println(acc);  // если хотим посмотреть по итерациям
        }
        return acc;
    }

    public static void printArr(String [] array) {
        System.out.println(Arrays.toString(array));
    }

}
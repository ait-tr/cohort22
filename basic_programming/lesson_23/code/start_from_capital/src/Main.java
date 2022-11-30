public class Main {
    public static void main(String[] args) {
        String phrase1 = "It is always warmer before rain. But I like when it is cold";
//        String word = "check";
//        String newWord = firstToUpper(word);
//        System.out.println(newWord);
        String phrase2 = firstLettersToUpper(phrase1);
        System.out.println(phrase2);
    }

    public static String firstLettersToUpper(String text) {
        String[] arr = text.split(" "); // Делим строку и создаем массив слов.
        for (int i = 0; i < arr.length; i++) { // Идём циклом по элементам массива - т.е. по словам.
            arr[i] = firstToUpper(arr[i]); // Вызываем метод, который мы сами написали.
        }
        return String.join(" ", arr); // соединить массив String обратно в один String
        // и возвращаем
    }

    public static String firstToUpper(String text) { // метод для одного слова
        String beginning = text.substring(0, 1);        // вырезаем строку
        String secondPart = text.substring(1); //
        String newBeginning = beginning.toUpperCase();
        return newBeginning + secondPart;
    }

    public static String firstToUpperVer2(String text) { // короткая версия метода firstToUpper
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
    // напишите метод, который принимает строку
    // - и переводит все первые символы после пробелов в верхний регистр
    // возвращает новую строку, например
    // "It Is Always Warmer Before Rain. But I Like When It Is Cold"
}
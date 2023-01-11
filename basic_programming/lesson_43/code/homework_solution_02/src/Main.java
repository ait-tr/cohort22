public class Main {
    public static void main(String[] args) {
//    ### Задание 2 Прокрустово ложе
//        Создайте метод, который принимает строку и возвращает обрезанную версию этой строки (первые пять символов и умолчание).
//        Например, для строки «January makes me wanna fly” метод вернет нам «Janua…”.
//        Если длинна строки короче или равна 5, она останется неизмененной.
//        Напишите тесты для проверки вашего метода.
//        (Подумайте о том, что будет если передают «», « » или null)

    }

    public static String shorten(String str){
        if (null == str){
            return null;
        }
        if (str.length() <= 5){
            return str;
        }
        return str.substring(0, 5) + "...";

    }
}
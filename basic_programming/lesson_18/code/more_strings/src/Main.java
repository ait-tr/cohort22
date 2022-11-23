public class Main {
    public static void main(String[] args) {
        // как сделать Sting из массива чар
        char[] charArr = {'2', ' ', 'b', 'e', ' ', 'o', 'r', ' ', 'n', 'o', 't', '2', 'b', 'e'};
        String text = new String(charArr);
        System.out.println(text);
        // еще один способ
        String text2 = String.valueOf(charArr);
        System.out.println(text2);
        // сравним
        System.out.println(text == text2); // так не нужно сравнивать
        System.out.println(text.equals(text2)); // проверяем вот так
        // метод substring -когда мы хотим получить фрагмент
        // метод возвращает тип String
        String text3 = "Time is all we have";
        String text4 = text3.substring(5);
        System.out.println(text4);
        String text5 = text3.substring(5, 11);
        System.out.println(text5);
        // создайте метод cutInUpper, который принимает строку
        // и два интеджера start, finish(включительно)
        // это метод возвращает новую строку
        // - которая является частью исходной с индекса start до finish
        // в новой строке все буквы в верхнем регистре
        System.out.println(cutInUpper("Hello it's me", 6, 8));
    }
    public static String cutInUpper(String text, int start, int finish) {
//        String newText = text.substring(start, finish+1);
//        return newText.toUpperCase();
        return text.substring(start, finish+1).toUpperCase(); // цепочка методов
    }

}
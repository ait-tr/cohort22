public class Main {
    public static void main(String[] args) {
        String phrase = "Get yourself a horse";
        System.out.println(phrase.length());
        char result = getCharByIndex(phrase,  21);
        System.out.println(result);
    }
    public static char getCharByIndex(String text, int index) {
        // хитрая проверка, чтобы учесть случаи, когда index выходит за границы нашей фразы.
        if(index >= text.length()) {
            index = text.length()-1;
        }
        if (index < 0) {
            index = 0;
        }
        return text.charAt(index);
    }
}
// Создайте метод типа char,
// который бы принимал строку и целое число,
// возвращал бы символ, который расположен в строке под этим числом.
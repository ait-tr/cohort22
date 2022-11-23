public class Main {
    public static void main(String[] args) {
        // экранирование
        // I like using ", it is my favourite sign
        // I like using \n, it is my favourite sign
        // экранируем " при помощи обратного слэша \
        String text = "I like using \", it is my favourite sign";
        System.out.println(text);
        String text2 =  "I like using \\n, it is my favourite sign";
        System.out.println(text2);
        String text3 = "I like stars \\s";
        System.out.println(text3);
    }
}
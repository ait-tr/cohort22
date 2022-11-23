public class Main {
    public static void main(String[] args) {
        // replaceAll
        String phrase = "Sun comes up every day";
        String phrase2 = phrase.replaceAll("u", "*");
        System.out.println(phrase);
        System.out.println(phrase2);
        String phrase3 = "aged wine is always good in making people high";
        String phrase4 = cipher(phrase3);
        System.out.println(phrase4);
        String phrase5 = decipher(phrase4);
        System.out.println(phrase5);
    }
    public static String cipher(String text) {
        return text.replaceAll("a", "*")
                .replaceAll("g", "-")
                .replaceAll("h", "%")
                .replaceAll("e", "@");
//        text = text.replaceAll("a", "*"); // длинный вариант
//        text = text.replaceAll("g", "-");
//        text = text.replaceAll("h", "%");
//        text = text.replaceAll("e", "@");
//        return text;
        // a заменил на *
        // h заменил на %
        // g заменил на -
        // e заменил на @
    }
    public static String decipher(String text) {
        return text.replaceAll("\\*", "a") // пришлось заэкранировать
                .replaceAll("-", "g")
                .replaceAll("%", "h")
                .replaceAll("@", "e");
    }
}
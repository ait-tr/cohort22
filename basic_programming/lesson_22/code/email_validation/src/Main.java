public class Main {
    public static void main(String[] args) {
    // email validation
        //  - хотим проверить содержит ли email '@'
        String email1 = "anna-rogozina@gmail.com";
        String email2 = "eugine2022.com";
        email1.charAt(0); // если хотим получить char по индексу
        // email1.length() // длина слова
        boolean result = isValid(email1);
        System.out.println(result);
        // проверим еще один
        System.out.println(isValid(email2));
        String email3 = "anna@rogozina@gmail.com";
        System.out.println(isValidOnly1(email3)); // false
        System.out.println(isValidOnly1(email2)); // false
        System.out.println(isValidOnly1(email1)); // true
        // есть готовый метод contains - он проверяет, содержит ли сторока указанный фрагмент
        System.out.println(email3.contains("@"));
        String phrase1 = "We will, we will rock you";
        boolean result2 = phrase1.contains("we"); // работает со String- двойные кавычки
        System.out.println(result2);
        //
    }
    public static boolean isValid(String text){
        for(int i = 0; i < text.length(); i++){
            if (text.charAt(i) == '@') {
                return true;
            }
        }
        return false;
    }
    public static boolean isValidOnly1(String text) {
        int counter = 0;
        for(int i = 0; i < text.length(); i++){
           if (text.charAt(i) == '@'){
               counter++;
           }
        }
        if(counter == 1) {
            return true;
        }
        return false;
    }


}
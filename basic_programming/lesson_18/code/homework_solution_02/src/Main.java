public class Main {
    public static void main(String[] args) {
        String phrase1 = "HELlo, IT's mE";
        phrase1 = whisper(phrase1);
        System.out.println(phrase1);
    }
    public static String whisper(String text) {
        String newText = text.toLowerCase();
        return newText;
    }
}

// Создайте метод whisper,
// который бы принимал строку и возвращал новую строку,
// в которой все буквы были бы в маленьком регистре(строчные).
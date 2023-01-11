public abstract class Tools {
    public static String rev(String input) {
        if (input.length() > 10) {
            StringBuilder sb = new StringBuilder(input);
            return sb.reverse().toString();
        }
        return input;
    }
}

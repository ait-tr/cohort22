public class Main {
    public static void main(String[] args) {
        /*
        Напишите метод для гадания по ромашке camomile(number),
        он принимает число лепестков,
        а возвращает нам значение String "He loves" или "He doesn't".
        Сохраните значение в переменную и распечатайте.
         */
        // command+shift+z - вперед; command+z - назад;

        int number = 30;
        String result1 = camomile(number);
        System.out.println(result1);
        String result2 = camomile2(number);
        System.out.println(result2);
    }

    public static String camomile2(int x) {
        String answer = "";
        if (x % 2 == 0) {
            answer = "He doesn't";
        } else {
            answer = "He loves";
        }
        return answer;
    }
    public static String camomile(int x) {
        if (x % 2 == 0) {
            return "He doesn't";
        } else {
            return "He loves";
        }
    }
}
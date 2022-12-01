public class Main {
    public static void main(String[] args) {
        // метод indexOf()
        String email = "alisher_berlin@gmail.com";
        String email2 = "vladimir@yahoo.com";
        int number = email.indexOf("_");           // возвращает индекс начала выражения
        System.out.println(number);
        int number2 = email.indexOf("l");         // возвращает индекс первого вхождения
        int number3 = email.lastIndexOf("l"); //  lastIndexOf - возвращает индекс последнего
        int number4 = email2.indexOf('x');        // для char тоже работает
        System.out.println(number4);
        int number5 = email2.indexOf("ir@");      // работает и для выражений
        System.out.println(number5);
        System.out.println(emailCutter(email));
        System.out.println(emailCutter(email2));
        // операторы сравнения
        // > - принимают численные типы и возвращают boolean
        // ==
        // логические операторы
        // &&, || - принимают boolean и возвращают boolean
        // ! - унарный - принимает boolean - возвращает boolean
        // ?
        // функция(параметр1, параметр2);
        // <опреранд1> <оператор> <операнд2>  Например, 2 + 3
        //  Тернарный оператор
        // <операданд1> ? <операнд2> : <операнд3>
        int x = 7+9; // в икс положили 16
        int y = true ? 9 : 13; // также работает как + или - просто в нем больше значений
        System.out.println(y);

    }

    public static String emailCutter(String text) {
//        return text.substring(0, text.indexOf("@")); // короткий способ
        int index = text.indexOf("@");
        String fragment = text.substring(0, index);
        return fragment;
    }

    public static boolean hasSubString(String text, String target) {
//        if (text.indexOf(target) == -1) { // долгий вариант
//            return false;
//        }
//        return true;
        return text.indexOf(target) != -1;   // короткий вариант
//        return text.indexOf(target) == -1 ? false : true; // если тернарником
    }


    // напишите метод emailCutter. Метод принимает  String, возвращает новый String
    // "alisher_berlin@gmail.com"   ---> "alisher_berlin"
    // возвращает обрезанную до "@" строку
    // до 19:30
}
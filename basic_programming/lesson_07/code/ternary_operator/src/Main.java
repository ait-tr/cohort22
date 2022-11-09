public class Main { //  Ternary operator
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        int c = sumMatch(a, b);
        int d = sumMatch2(a, b);
//        System.out.println(c);
//        System.out.println(d);

        int result = max(a, b); // метод макс возращает наибольший аргумент
        System.out.println(result);
    }

    //    public static int max(int x1, int x2) { // вариант без тернарника
//        if (x1 > x2) {
//            return x1;
//        } else {
//            return x2;
//        }
//    }
    public static int max(int x1, int x2) {
        return x1>x2 ? x1 : x2;
        // java cheatsheet
        // тернарный оператор // условие ? возвращает, если усл истинно : возвращает если ложно;
    }

    public static int sumMatch2(int a, int b ) {
        return a==b ? a+b : a-b; // когда истина return a+b, когда ложь return a-b;
    }

    public static int sumMatch(int a, int b) {
        if (a == b) {
            return a + b;
        } else {
            return a - b;
        }
    }
}

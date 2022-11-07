public class Main {
    public static void main(String[] args) {
        int fingersShown = 1; // 2 fingers for victory
        doWeWeen(fingersShown);
    }
    public static void doWeWeen(int fingers) {
//        boolean savedValue = fingers == 2; // сохранили результат сравнения в переменную с именем savedValue
//        System.out.println(savedValue);
        if (fingers == 2) {
            System.out.println("It's a victory");
        } else {
            System.out.println("It is a loose. Maybe next time will be better");
        }
    }
}
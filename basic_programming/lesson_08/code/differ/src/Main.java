public class Main {
    public static void main(String[] args) {
        // пользователь вводит два числа
        // чтобы если разница между числами равна 10 или 30 - программа выводит
        // на экран "Huray", если нет - "Neh"
        int first = 180;
        int second = 150;
        int diff = positiveDif(first, second);
        if (diff == 10 || diff == 30) {
            System.out.println("Huray");
        } else {
            System.out.println("Nay");
        }
    }
    public static int positiveDif(int a, int b) {
        if (a > b) {
            return a-b;
        } else {
            return b-a;
        }
    }
}
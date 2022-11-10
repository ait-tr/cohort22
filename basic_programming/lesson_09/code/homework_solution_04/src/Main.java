public class Main {
    public static void main(String[] args) {
        // n % 6 == 0   --->  "Himmel und Erde";
        // 100   ---> "Sagen Sie mir, kann man in Ihrem Land durch Null teilen?"
        // для всех остальных мы просто печатаем само число
        int step = 30;
        cantWalks(step);
        cantWalks(30); // пошел за красным
        cantWalks(30); // вернулся с вином домой
        cantWalks(500); // пошел к соседу за штопором
    }
    public static void cantWalks(int x) {
        int i = 1;
        while(i <= x) {
            if(i % 6 == 0) {
                System.out.println("Himmel und Erde");
            } else if(i == 100) {
                System.out.println("Sagen Sie mir, kann man in Ihrem Land durch Null teilen?");
            } else {
                System.out.println(i); // (!(i % 6 == 0 || i == 100))закон де моргана
            }
            i++;
        }
    }
}
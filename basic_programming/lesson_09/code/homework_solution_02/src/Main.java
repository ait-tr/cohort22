public class Main {
    public static void main(String[] args) {
        // 7 14 21 28 35 ... 98
        showNumbers();
    }
    public static void showNumbers(){
        int i = 7;
        while(i <= 98) {
            System.out.println(i);
            i += 7; // то же самое что i = i+7;
        }

    }
}
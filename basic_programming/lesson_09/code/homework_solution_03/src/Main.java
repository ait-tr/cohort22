public class Main {
    public static void main(String[] args) {
        //  1 2 4 8 16 32 64 128 256 512
        show();
    }
    public static void show() {
        int i = 1;
        while(i <= 512) {
            System.out.println(i);
            i *=2; // i = i * 2
        }

    }
}
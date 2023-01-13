public class Main {
    public static void main(String[] args) {

    printAllUntil9(9);

    }
    private static void printAllUntil9(int n){
        System.out.println(n);
        if (n==9)
            return;
        printAllUntil9(n+1);


    }

}
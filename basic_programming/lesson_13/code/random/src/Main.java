public class Main {
    public static void main(String[] args) {
//        double x = Math.random();
//        System.out.println(x);
        // преобразует double в int
        int max = 3; // верхняя граница наших чисел (не включительно)
        int min = 0; // нижняя граница - включительно
        int y = (int) (min + Math.random()*(max-min)); // формула
        System.out.println(y);
        String[] pig = {"Nif-Nif", "Naf-Naf", "Nuf-Nuf"};
        System.out.println(pig[y]);
    }
}
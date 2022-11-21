import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 19, 4, 28, 6, 3, 4};
        printArray(numbers);
//        int x = indexMinInRange(numbers, 1);
//        System.out.println(x);
        selectionSort(numbers);
        printArray(numbers);
    }
    public static void selectionSort(int[] array) {
        for(int i = 0; i < (array.length -1); i++) {
            int storage = array[i]; // переменная для хранения
            int indexMin = indexMinInRange(array, i); // вызовем метод
            array[i] = array[indexMin];
            array[indexMin] = storage;
//            printArray(array); // раскоментить - чтобы посмотреть по итерациям
        }
    }
    public static int indexMinInRange(int[] array, int start) {
        int min = array[start];
        int indexOfMin = start;
        for(int i = start; i < array.length; i++) {
           if (array[i] < min) {
               min = array[i];
               indexOfMin = i;
           }
        }
        return indexOfMin;
    }
    public static void printArray(int[] array) {
        String x = Arrays.toString(array); // преобразовали в строку наш массив //  вместо for
        System.out.println(x);
    }

}
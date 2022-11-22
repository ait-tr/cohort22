import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 7, 9, 10};
        print(numbers); // [1, 3, 5, 6, 7, 9, 10]
        shuffle(numbers);
//        // первая итерация
//        int storage = numbers[0];
//        numbers[0] = numbers[1];
//        numbers[1] = storage;
//        // вторая итерация
//        storage = numbers[2];
//        numbers[2] = numbers[3];
//        numbers[3] = storage;
//        // третья итерация
//        storage = numbers[4];
//        numbers[4] = numbers[5];
//        numbers[5] = storage;
        print(numbers); // [3, 1, 6, 5, 9, 7, 10]
    }
    public static void shuffle(int[] array) {
        for(int i = 0; i < array.length - 1; i += 2) {
                int storage = array[i];
                array[i] = array[i + 1];
                array[i + 1] = storage;

//            if (i % 2 == 0 || i == 0) { // вариант, когда i++
//                int storage = array[i];
//                array[i] = array[i + 1];
//                array[i + 1] = storage;
//            }
//            print(array); // если хотим посмотреть по итерациям
        }
    }
    public static void print(int[] array) {
        String x = Arrays.toString(array); //
        System.out.println(x);
    }
}
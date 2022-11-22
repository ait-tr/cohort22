import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 12, 24, 38, 38, 91, 92, 100, 1500, 1520};
        int target = 38;
        int x = binarySearch(numbers, target);
        System.out.println(x); // метод возвращает индекс искомого элемента
    }
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while(left <= right) {
            int middle = (left + right)/2;
            if(array[middle] == target){
                return middle;
            } else if (target > array[middle]) {
                left = middle + 1;  // ищем справа - для этого перемещаем левую границу
            } else {                // когда target < array[middle]
                right = middle - 1; // ищем слева  - для этого перемещаем правую границу
            }
        }
        return -1;
    }
    public static void print(int[] array) {
        String x = Arrays.toString(array); //
        System.out.println(x);
    }
}
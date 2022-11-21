import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        ### Задание 3 *
//
//         Создайте метод типа void с именем reverse, который бы принимал массив и менял элементы массива местами
//         - т.е. разворачивал массив (первые его элементы стали бы последними).
//         Например, массив int[] numbers = {0, 19, 20, 14} после применения метода стал бы {14, 20, 19, 0}.
//        (Вам может пригодиться дополнительная переменная для хранения данных)
//        (Со звездочкой - перепишите решение, используя цикл while).
        int[] numbers = {18, 8, 4, -9, 12, 13, 3};
        printArray(numbers);
        reverse(numbers);
        printArray(numbers);
        reverse(numbers);
        printArray(numbers);
        makeSecondNull(numbers);
        printArray(numbers);
    }
    public static void reverse(int[] array) {
        for(int i = 0; i<(array.length/2); i++) {
            int storage = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = storage;
        }
    }
    public static void printArray(int[] array) {
        String x = Arrays.toString(array); // преобразовали в строку наш массив //  вместо for
        System.out.println(x);
    }

    public static void makeSecondNull(int[] array) {
        array[1] = 0; // мутирующие методы - меняют наш исходный массив
    }

}
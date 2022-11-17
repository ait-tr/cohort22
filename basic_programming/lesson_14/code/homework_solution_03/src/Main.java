public class Main {
    public static void main(String[] args) {
        // создали массивы разной длины
        int [] numbers1 = new int[15];
        int [] numbers2 = new int[29];
        int [] numbers3 = new int[2];
        // здесь посмотрели, что находится в массиве
        printArray(numbers1);
        printArray(numbers2);
        printArray(numbers3);
        // здесь заполняем массивы значениями
        fillArray(numbers2);
        fillArray(numbers3);
        // еще раз распечаем и посмотрим, что изменилоось
        printArray(numbers2);
        printArray(numbers3);
    }
    public static void fillArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10); // числа от нуля до девяти
        }
    }
    public static void printArray(int[] array) {
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
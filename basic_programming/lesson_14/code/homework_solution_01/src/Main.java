public class Main {
    public static void main(String[] args) {
//        Создайте массив из 37 элементов.
//        Заполните его случайными числами
//        (из диапазона от 3 до 19 включительно).
//        Выведите массив на печать.
        int[] numbers = new int[37];
        fillArray(numbers);
        printArray(numbers);
    }
    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            int min = 3;
            int max = 19; // наша формула немного изменилась
            int randomNumber = (int)(min + Math.random()*(max-min+1));
            array[i] = randomNumber;
        }
    }
    public static void printArray(int[] array) {
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
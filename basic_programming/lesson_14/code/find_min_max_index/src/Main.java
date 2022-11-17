public class Main {
    public static void main(String[] args) {
    int[] numbers = {12, -16, 1239, 123324, -980, 1000};
    printArray(numbers);
    int resultNumber = findMaxIndex(numbers);
    System.out.println(resultNumber);
    int minIndex = findIndexMin(numbers);
    System.out.println(minIndex);
    }
    public static int findMaxIndex(int[] array) {
        // здесь ваше решение // до 19:20 время на выполение
        int biggestIndex = 0;
        int biggestNumber = array[0];
        for(int i=0; i < array.length; i++) {
            if (array[i] > biggestNumber) {
               biggestIndex = i;
               biggestNumber = array[i];
            }
        }
        System.out.println();
        return biggestIndex;
    }
    public static int findIndexMin(int[] array) {
        int biggestIndex = 0;
        int biggestNumber = array[0];
        for(int i=0; i < array.length; i++) {
            if (array[i] < biggestNumber) {
                biggestIndex = i;
                biggestNumber = array[i];
            }
        }
        return biggestIndex;
    }
    public static void printArray(int[] array) {
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
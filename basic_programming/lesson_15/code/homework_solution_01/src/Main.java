public class Main {
    public static void main(String[] args) {
        int[] numbers1 = {5, 2, 7, 10, 8, 6, 3, 5, 0, 1};
        int[] numbers2 = {0, 9, -9, 12, 17};
        int[] numbers3 = {1, -19, 9, 0, 12, 12};

        printArray(numbers1);
        printArray(numbers2);
        printArray(numbers3);

        System.out.println(getMax(numbers1));
        System.out.println(getMax(numbers2));
        System.out.println(getMax(numbers3));

        fillArray(numbers2);
        printArray(numbers2);
    }
    public static void fillArray(int[] array){
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10);
        }
    }
    public static int getMax(int[] array) {
        int biggestSoFar = array[0];
//        for(int i = 0; i < array.length; i++){  // цикл for
//            if (biggestSoFar < array[i]) {
//                biggestSoFar = array[i];
//            }
//        }
        for(int element: array) {  // for-each
            if (biggestSoFar < element) {
                biggestSoFar = element;
            }
        }
        return biggestSoFar;
    }
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " " );
        }
        System.out.println();// перенос строки
    }
}
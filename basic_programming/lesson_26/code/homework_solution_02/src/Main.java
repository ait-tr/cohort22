public class Main {
    public static void main(String[] args) {

        int[][] arr1 = {{2, 7, 9}, //   2,   8,  7
                {9, 8, 3}, // [0][0],[1][1],[2][2]
                {1, 8, 7}};// [i][i]
        int[][] arr2 = {
                {2, 7, 9, 4}, // 2, 2, 4, 7
                {3, 2, 3, 3}, // [0][0],[1][1],[2][2],[3][3]
                {5, 5, 4, 9},
                {2, 3, 2, 7}
        };
        printDiagonal(arr1);
        printDiagonal(arr2);
        int[][] arr3 = {
                {2, 7, 9, 4}, //    4,    3,     5,     2
                {3, 2, 3, 3}, // [0][3],[1][2],[2][1],[3][0]
                {5, 5, 4, 9},
                {2, 3, 2, 7}
        };
        printOppositeDiagonal(arr3);
        printOppositeDiagonal2(arr3);
        printOppositeDiagonal3(arr3);
//        for(int i = 0, j = 20; i < 20 && j > 0; i++, j--) { // можно побаловаться
//            System.out.println(i + " "+ j);
//        }

    }

    public static void printOppositeDiagonal3(int[][] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[array.length - i - 1][i] + " ");
        }
        System.out.println();
    }

    public static void printOppositeDiagonal2(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][array.length - i - 1] + " ");
        }
        System.out.println();
    }

    public static void printOppositeDiagonal(int[][] array) {
        int counter = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][counter] + " ");
            counter--;
        }
        System.out.println();
    }

    public static void printDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();
    }

    public static void printDiagonal2(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}
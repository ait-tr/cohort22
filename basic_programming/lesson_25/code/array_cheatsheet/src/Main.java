
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] inputArr = new String[]{ // один способ создать массив
                "text",
                "code",
                "list"
        };
        int[] numbers = new int[20];
        char[] charArr = new char[10];
        boolean[] liars = new boolean[10];
        // Они заполнены значениями по умолчанию
        // int, char и других численных типов --> 0
        // String  --> null
        // boolean --> false
        int[] theShortestArray = new int[0];
        // .length - чтобы посмотреть длину
        System.out.println(theShortestArray.length);
        // Arrays.toString()
        String arrayAsString = Arrays.toString(inputArr);
        System.out.println(arrayAsString);
        // Arrays.fill() - для заполнения массива
        System.out.println(Arrays.toString(charArr));
        Arrays.fill(charArr, 'l');
        System.out.println(Arrays.toString(charArr));
        // мутирующие методы и не мутирующие методы
        // если мы меняем исходный массив - то мутирующий
        // если не меняем - то не мутирующий
        // Можно ли мутировать строку?
        String text = "Something about mutability of strings";
        text = text.toUpperCase();
        System.out.println(text);
        // строки не мутируют
        // multidimensional arrays
        int[] nums = new int[3];
        System.out.println(nums.length);

        int[][] multiArr = new int[6][3];  // создали 6 строк - 3 столбцы
        int[][] numbers2 = {{1, 2}, {8, 14}, {19, 26}};
        int[][] numbers3 = new int[3][2];
        System.out.println(numbers2[0].length);
        // вывод в печать двумерного массива
        int[][] numbers4 = {{1, 2}, {8, 14, 8}, {19, 26, 24, 2, 15}};
        // можем используем Arrays.toString()
        for(int i = 0; i < numbers4.length; i++){
            System.out.println(Arrays.toString(numbers4[i]));
        }
        System.out.println("________");
        // без Arrays.toString()
        for(int i = 0; i < numbers4.length; i++){
            for(int j = 0; j < numbers4[i].length; j++){
                System.out.print(numbers4[i][j] + " " );
            }
            System.out.println(); // перенос строки
        }
        numbers4[1][1] = 15;      // изменить значение одной ячейки массива

        numbers4[2][2] = numbers4[2][2] * 2; //
        System.out.println("_________");
        for(int i = 0; i < numbers4.length; i++){
            for(int j = 0; j < numbers4[i].length; j++){
                System.out.print(numbers4[i][j] + " " );
            }
            System.out.println(); // перенос строки
        }

    }

}
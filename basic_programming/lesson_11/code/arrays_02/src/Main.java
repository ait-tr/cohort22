public class Main {
    public static void main(String[] args) {

        // создайте массив из 30 элементов
        // сохраните туда числа по возрастанию от 25
        // выведите в печать элементы массива массив
        // 25, 26, 27 ,,, 55    (возможно тут 54)

        int[] myArray = new int[30];
//            int base = 25;
//        myArray[0] = 25;
//        myArray[1] = 25 + 1;
//        myArray[2] = 25 + 2;
//        myArray[3] = 25 + 3;
//        myArray[4] = 25 + 4;

        for(int i = 0; i < myArray.length; i++){
            myArray[i] = 25 + i;
            System.out.println(myArray[i]);
        }
    }
}
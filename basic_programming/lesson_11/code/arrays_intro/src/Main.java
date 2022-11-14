public class Main {
    public static void main(String[] args) {
        int[] myNumbers = {1, 7, 8, 16 }; //создали новый, длина 4, имя myNumbers, тип int[], нумерация идет с нуля
        System.out.println(myNumbers[3]); // под индексом 3 у нас лежит 16
        System.out.println("Значение до " + myNumbers[2]);
        myNumbers[2] = 288;
        System.out.println("Значение после " + myNumbers[2]);
        System.out.println("Length of array: " + myNumbers.length);
        System.out.println(myNumbers[myNumbers.length-1]); // здесь мы получили последний элемент массива
        int[] twentyDigitPassword = new int[20]; // создали массив - записали в переменную, в нем 20ть нулей
        System.out.println(twentyDigitPassword[3]);
        // хочу изменить пятый элемент массива на 198
        twentyDigitPassword[4] = 198;
        System.out.println(myNumbers.length);

        for(int i = 0; i < twentyDigitPassword.length; i++) {
            System.out.print("index: " + i + " "); // значение счетчика
            System.out.println(twentyDigitPassword[i]);
        }


    }
}
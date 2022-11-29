public class Main {
    public static void main(String[] args) {
        String[] wordsArr = {"Every", "day", "sun", "rises", "and",
                "every", "evening", "it", "goes", "down"};
        String result = joinArrWords(wordsArr);
        System.out.println(result);
    }
    public static String joinArrWords(String[] array) {
        String separator = "+-+";
        String accumulator = array[1];
        for(int i = 3; i < array.length; i+=2){
            accumulator = accumulator + separator + array[i];// сахар  accumulator +=  separator + array[i];
        }
        return accumulator;
    }
}

/*
    Дан массив строк.
    Создайте метод, который бы объединял все четные элементы массива (строки) через разделитель.
    Метод принимает массив строк и строку разделитель. Возвращает новую строку.
    Например, для массива [It's, raining, outside, you'd better, take, an, umbrella]
    и разделителя "+-+", метод вернет нам строку
     "raining+-+you'd better+-+an"
 */

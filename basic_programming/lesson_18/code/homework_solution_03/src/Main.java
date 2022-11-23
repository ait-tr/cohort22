public class Main {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "mango", "pineapple"};
        String target = "apple";
        int result = getIndexOfWord(fruits, target);
        System.out.println(result);
    }
    public static int getIndexOfWord(String[] arrayOfWords, String word) {
        for(int i = 0; i < arrayOfWords.length; i++){
            if (arrayOfWords[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }
}
// Создайте метод, который бы принимал
// массив строк и слово,
// которое мы бы хотели найти.
// Пусть этот метод возвращает индекс слова, которое мы желаем найти.
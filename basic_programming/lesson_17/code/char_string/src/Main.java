public class Main {
    public static void main(String[] args) {
        char char1 = '\n';
        char char2 = 'e'; // можем объявить вот так переменную
        char char3 = 'y'; // не можем поместить слово
        String phrase = "Hello world";
        // length() показывает длину строки,  сколько в ней элементов
        System.out.println(phrase.length());
        // charAt() - чтобы получить char по его индексу
        char char4 = phrase.charAt(1);
        System.out.println(char4);
        // создать новую строку - в верхнем регистре(upper case) // нужно сохранять результат
        String phraseInUpper = phrase.toUpperCase();
        System.out.println(phraseInUpper);
        // в нижнем регистре
        String phraseInLower = phrase.toLowerCase();
        System.out.println(phraseInLower);
        // создайте метод, принимает строку - возвращет новую строку в верхнем регистре
        // назовите его shout
        String word = "stop"; // STOP
        System.out.println(word);
        String word2 = shout(word);
        System.out.println(shout(word2));
        // пройтись по String циклом for
        String longPhrase = "Hey, Bobby, how are you?";
        for(int i = 0; i < longPhrase.length(); i++) {
            char x = longPhrase.charAt(i);
            System.out.println(x);
        }
        String fruit = "Apple";
        // создать String из массива char
        char[] symbols = {'A', 'p', 'p', 'l', 'e'};
        String newWord = new String(symbols); // создали новую строку
        System.out.println(newWord);
        // проблемы с равенством ==, почему equals
        String fruit2 = "Apple";
        System.out.println(fruit2 == newWord); // сравниваем Apple и Apple -- здесь false
        System.out.println(fruit2 == fruit);   // сравниваем Apple и Apple -- здесь true
        // == не стоит использовать для стрингов
        System.out.println("_______");
        // поэтому используем equals()
        System.out.println(fruit2.equals(newWord) ); // true
        System.out.println(fruit2.equals(fruit));    // true
        System.out.println("_______");
        Character h = 'h';  // методы можно вызываеть только если переменная
        char g = 'g';
        boolean result = h.equals(g);
//        boolean result2 = g == h;
        System.out.println(result);
//        System.out.println(result2);
        int gInt = g;
        System.out.println(gInt); // распечатался номер из кодировки
    }
    public static String shout(String word) {
        return word.toUpperCase();
    }
}
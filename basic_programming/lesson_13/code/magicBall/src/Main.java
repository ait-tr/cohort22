public class Main {
    public static void main(String[] args) {
    magic8ball();
    }
    public static void magic8ball() {
        int max = 8; // верхняя граница наших чисел (не включительно)
        int min = 0; // нижняя граница - включительно
        int y = (int) (min + Math.random()*(max-min));
        // здесь пишите код
        String[] answers = {
                "It is certain",
                "It is decidedly so",
                "Without a doubt",
                "Yes — definitely",
                "Don’t count on it",
                "My reply is no",
                "Very doubtful",
                "Spirits say no"
        };
        System.out.println(answers[y]);
    }
}
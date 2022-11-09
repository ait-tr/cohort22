public class Main {
    public static void main(String[] args) {
        int years = 0;
        int months = 13;
        int days = showDays(years, months);
        System.out.println(days);
    }
    public static int showDays(int x1, int x2) {
        if (x2 > 12) {
            System.out.println("Months should be under 13");
        }
        int result = x1 * 365 + x2 * 29
        return result;
    }
}

// вызываем метод -
// вызов метода - это просто воспроизведение кода,
// написанного в другом месте
// у метода есть имя - по которому его вызываем
// и у него есть тело - в фигурных скобках (блок)
// если метод без ретерна - то у него тип войд
// если метод с ретерном, то у него будет тот тип такой же
// как у того, что стоит после ретерна (String, double, int и т.д.)
}
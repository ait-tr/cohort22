public class Main {
    public static void main(String[] args) {
        // напишите метод типа double, который
        // принимает сумму денег и число месяцев
        // возвращает сумму денег на счету через указанное время
        // каждый месяц сумма денег увеличивается на 7%
        // сделайте переменную, куда сохраните результат выполнения метода
        // тип у нее будет double
        double money = 1000;
        int months = 2;
        money = openAccount(money, months);
        System.out.println(money);
    }
    public static double openAccount(double money, int months) {
        for(int i = 1; i <= months; i++) {
            money = money  + money * 0.07;
        }
        return money;
    }

}
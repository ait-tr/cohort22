public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(Fuel.DIESEL.getPrice());

        Car lada = new Car("Lada Calina", 45, Fuel.PETROL_98);
        System.out.println(lada.calculateFullTankPrice());
/*

Создайте enum Fuel c полем double price.
Пусть будет несколько типов топлива:
- Бензин 95 по цене 1,57 за литр;
- Бензин 98 по цене 1.76 за литр;
- Дизель по цене 1,74 за литр.

Создайте класс автомобиль с полями:
- Название;
- Объем бака в литрах;
- Fuel fuel - тип топлива.
Пусть у автомобиля будет метод - рассчитать стоимость полного бака, он должен рассчитывать сколько стоит заправить полный бак.


 */
    }
}
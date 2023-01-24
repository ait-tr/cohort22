public class Main {
    public static void main(String[] args) {

       /*

Создайте класс корабль Ship с полями:
- Название;
- Тип топлива: бензин, дизель;
- Наличие турбины: да, нет
- Мощность от 300 до 1000.

Пусть у класса будет метод рассчитать стоимость топлива: calculateCosts()
- Стоимость рассчитывается  по формуле: мощность умножить на стоимость бензина, умножить на коэффициент от турбины.
Бензин стоит 70, дизель 60.
При наличии турбины потребление топлива возрастает на коэффициент 1.3.
- Создайте обычный экземпляр класса Ship и создайте экземпляр анонимного класса.
        */
        Ship titanic = new Ship("Titanic", true, false, 1000);
        System.out.println(titanic.calculateCosts());

        Ship blackPearl = new Ship("Black Pearl", false, false, 300){
            @Override
            public double calculateCosts(){
                return getPower() * 300;
            }
        };
        System.out.println(blackPearl.calculateCosts());
    }
}
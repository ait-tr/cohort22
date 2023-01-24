public class Main {
    public static void main(String[] args) {
        // создайте класс Здание Building со следующими полями:
        // - Класс энергоэффективности - от 1 до 4; int
        // - Название;
        // - Источник отопления:  газ, либо уголь. boolean

        // Пусть у этого класса будет метод double calculateHeatingCosts().
        // Если класс 1, то умножаем 20 на цену топлива.
        // Если класс 2, то умножаем 15 на цену топлива.
        // Если класс 3, то умножаем 13 на цену топлива.
        // Если класс 4, то умножаем 10 на цену топлива.
        // Уголь стоит 50.
        // Газ стоит 70.

        // Создать объект анонимного класса и в нем переписать метод calculateHeatingCosts
        // по другой логике на ваше усмотрение.
        Building house1 = new Building("Избушка на курьих ножках", 1, false);
        System.out.println(house1.calculateHeatingCosts());

        Building house2 = new Building("Пряничный домик", 3, true){
            @Override
            public double calculateHeatingCosts(){
                return 15 * (getIsGas() ? 80 : 120);
            }
            public void welcome(){
                System.out.println("Welcome to "+ getTitle());
            }
        };



        System.out.println(house2.calculateHeatingCosts());



    }
}
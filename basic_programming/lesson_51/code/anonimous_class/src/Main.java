

public class Main {
    public static void main(String[] args) {
        CanSing singingBird = new CanSing() {
            @Override
            public void sing() {
                System.out.println("Чик-чирик-чи-чик");
            }
            public String toString(){
                return "Я ту-стринг";
            }
        };
        singingBird.sing();

        // создайте интерфейс CanSwim с методом void swim
        // создайте два объекта анононимных классов
        // чтобы у первого метод swim выводил "Я топор - плыву вниз"
        // а у второго, чтобы выводил "А я плыву брасом"


        CanSing singingBird2 = new CanSing() {
            @Override
            public void sing() {
                System.out.println("Чик-чак");
            }
        };
        CanSwim axe = new CanSwim() {
            @Override
            public void swim() {
                System.out.println("Я топор - плыву только вниз");
            }
        };
        axe.swim();

        CanSwim swimmer = new CanSwim() {
            @Override
            public void swim() {
                System.out.println("Я плыву брасом");
            }
        };
        swimmer.swim();
        // можем переписать методы используя анонимный класс - переопределим display
        Plate mutatedPlate = new Plate("Ceramics", 17,"deep", "yellow"){
            @Override
            public void displayInfo(){
                System.out.println(title + " "+ diameter + " " + type + " Это реализация от анонимного класса!");
            }
        };
        mutatedPlate.displayInfo();
        // создайте класс Здание Building со следующими полями:
        // - Класс энергоэффективности - от 1 до 4;
        // - Название;
        // - Источник отопления:  газ, либо уголь.

        // Пусть у этого класса будет метод double calculateHeatingCosts().
        // Если класс 1, то умножаем 20 на цену топлива.
        // Если класс 2, то умножаем 15 на цену топлива.
        // Если класс 3, то умножаем 13 на цену топлива.
        // Если класс 4, то умножаем 10 на цену топлива.
        // Уголь стоит 50.
        // Газ стоит 70.

        // Создать объект анонимного класса и в нем переписать метод calculateHeatingCosts
        // по другой логике на ваше усмотрение.


    }
}
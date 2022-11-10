public class Main {
    public static void main(String[] args) {
        // нужно чтобы выводил в консоль номер дня "Day 1"... "Day 2" до 200
        // показать сколько в бочке литров воды в этот день  "Barrel has n liters"
        // каждый день в бочку набирается по 2 литра дождевой воды
        // бочка 50 литров
        // когда бочка переполянется ее выливают
        // Пример одной строки: "Day 3 Barrel has 6 liters"
        int barrel = 0;
        int i = 1;
        while(i <= 200) {
            System.out.println("Day " + i + " Barrel has " + barrel + " liters");
            if (barrel == 50) {
                barrel = 0;
            }
            barrel += 2; // barrel = barrel + 2;
            i++;
        }
    }
}
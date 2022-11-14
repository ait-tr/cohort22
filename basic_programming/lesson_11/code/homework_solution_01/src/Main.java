public class Main {
    public static void main(String[] args) {
       int age = 8;
       double height = 150;

        tree(height, age);
    }
    public static void tree(double height, int age) {
        for(int i = age; i <= 120; i++) {
            System.out.printf("Year: " + i + " " + "Height: %.2f \n", height);
            if (i <= 20){
                height *= 1.20;
            } else {
                height *= 1.08;
            }
        }
    }
}

//    Напишите метод tree(height, age), который описывает жизнь дерева.
//    Он принимает в себя первоначальную высоту и возраст дерева и выводит в консоль
//    описание дерева для каждого года его жизни. Каждый год дерево растет. Пока его возраст меньше 20 лет,
//    оно растет на 20% каждый год, после 20 лет - на 8%.
//    Максимальный возраст дерева 120 лет. (После смерти цикл прерывается).
//
//        Пример для tree(150, 13);
//
//        Years: 13 Height: 150
//
//        Years: 14 Height: 180 ...
//        и так далее
//### Задание 1
//
//        Создайте метод типа boolean,
//        который принимает число и возвращает true,
//        если число кратно 6,
//        в противном случае возвращает false.
//
//        ### Задание 2
//
//        Создайте еще один метод типа boolean, который принимает число и возвращает true,
//        если число кратно 36 и при этом не равно 36, в противном случае возвращает false.
//        Создайте цикл while, который бы последовательно выводил бы целые числа от 1 в консоль
//        (например, 1, 2, и так далее) и прекратил бы это делать,
//        когда число выведенное в консоль было бы кратно 36 и при этом не равно 36.
//        (Вам может пригодиться оператор отрицания "!")
public class Main {
    public static void main(String[] args) {
        System.out.println(multiple6(35)); // аргумент
        System.out.println(multiple36not36(36));
        boolean indicator = true;
        int i = 1;
        while(indicator) {
            System.out.println(i);
            if (multiple36not36(i)){
                indicator = false;
            }
            i++;
        }
//        int i = 0; // а вот еще вариант, как можно было бы сделать
//        while(!(multiple36not36(i) && (i != 0))) { // !(multiple36not36(i)) || i == 0
//            i++;
//            System.out.println(i);
//        }
    }
    public static boolean multiple6(int number){ // параметр
        return number % 36 == 0;
    }
    public static boolean multiple36not36(int number){
        return (number % 36 == 0) && (number != 36);
    }

}
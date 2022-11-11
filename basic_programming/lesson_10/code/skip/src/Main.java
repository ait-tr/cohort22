public class Main {
    public static void main(String[] args) {
        // напишите метод, который принимает finish
// он ничего не возвращает - только печатает вот такой ряд из примера
// пока не дойдет до finish
// пропускаем кратное 5 и следущее за ним,
// например мы пропустим 5 и 6, 10 и 11, 15 и 16
// 1
// 2
// 3
// 4
// 7
// 8
// 9
// 12
// 13
// 14
// 17
// ..
        int finish = 20;
//        skip(finish);
        skip2(finish);
    }

    public static void skip2(int x) {
        for(int i = 1; i <=x; i++){
            if(i % 5 == 0) {
                i +=2;
            }
            System.out.println(i);
        }
    }

    public static void skip(int x) {
        for(int i = 1; i <= x; i++) {
            if (i==1 || ((i-1) % 5 != 0 && i % 5 != 0)) {
                System.out.println(i);
            }
        }
    }

}
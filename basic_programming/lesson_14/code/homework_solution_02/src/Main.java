public class Main {
    public static void main(String[] args) {
//        Напишите метод tossCoin(), который бы
//        случайным образом выводил бы в консоль одно из значений: "head", "tail". (
//          прим. tossCoin - бросать монетку, head - орел, tail- решка)
        tossCoin();
        tossCoin();
    }
    public static void tossCoin(){
        String[] answers = {"head", "tail"};
        int randomNumber = (int) (Math.random() * 2);
        System.out.println(answers[randomNumber]);
    }
}
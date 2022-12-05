public class Main {
    public static void main(String[] args) {
        System.out.println(decToBinary(58));
        System.out.println(binaryToDec(10110110));
        System.out.println(binaryToDec(111010));
    }

    public static String decToBinary(int dec) {
        String acc = "";
        int remainder;
        while (dec > 0) {
            remainder = dec % 2;    // текущий остаток от деления
            acc = remainder + acc;  // строка, к которой приплюсовываем
            dec = dec / 2;          // уменьшение числа, делим на 2
        }
        return acc;
    }

    public static int binaryToDec(int binary) {
        // https://calculatori.ru/perevod-chisel.html
        int accumulator = 0;        // аккумулируем слагаемые
        int power = 0;              // степень
        int reminder = 0;           // в ней будем хранить числа
        while(binary > 0) {
            reminder = binary % 10;
            accumulator = accumulator + reminder * twoInPower(power);
            binary = binary / 10;
            power++;
        }
        return accumulator;
    }

    public static int twoInPower(int power) {
        int accum = 1;
        for(int i = 0; i < power; i++){
            accum = accum * 2;
        }
        return accum;
    }
}



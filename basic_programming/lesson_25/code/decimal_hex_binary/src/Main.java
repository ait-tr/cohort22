public class Main {
    public static void main(String[] args) {
        // decimal
        int x = 182;        // без // decimal
        int y = 0b10110110; // 0b  // 10-я
        int f = 0266;       // 0   // 8-я
        int p = 0xB6;       // 0x  // 16-я

        System.out.println(x);
        System.out.println(y);
        System.out.println(f);
        System.out.println(p);
        // можно посмотреть как выглядит в двоичной системе
        // для этого преобразуем в строку
        System.out.println(Integer.toBinaryString(x));// 2-я
        System.out.println(Integer.toHexString(x));   // 16-я
        System.out.println(Integer.toOctalString(x)); // 8-я
        decToBinary(58);

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

    public static int binaryToDec(int bin) {
        // напишите метод, который принимает int
        // возвращает int
        // переводит из двоичной в десятичную
        // binaryToDec(111010) он вернет нам 58
        // https://calculatori.ru/perevod-chisel.html
        return -1; // измените здесь
    }
}



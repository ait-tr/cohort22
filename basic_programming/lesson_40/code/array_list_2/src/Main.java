import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        char char1 = 'a';
        Character char2 = 'a';
        boolean bool1 = true;
        Boolean bool2 = true;
        int x1 = 1;
        Integer x2 = 1;
        Experiment exp = new Experiment();
        System.out.println(exp.x);          // 0
        System.out.println(exp.x2);         // null
        ArrayList<Integer> numbers = new ArrayList<>();
        // всегда используем не примитивы, а классы обертки
        int num1 = 9;
        Integer num2 = 128;
        Integer num3 = 128;
        System.out.println(num2.equals(num3));
        // для объектов используем equals
        byte x = 127;       // 1 byte
        short x3 = 32767;   // 2 byte
        int x4 = 2147483647;// 4 byte;
        long x5 = 132;      // 8 byte
        //        System.out.println(x*x*x*x*x);
        //
    }
}
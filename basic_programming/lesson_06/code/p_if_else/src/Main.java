public class Main {
    public static void main(String[] args) {
       int myHeight = 171;
       int requiredHeight = 150;
       // >  - больше
        // < - меньше
        // >= - больше или равно
        // <= - меньше или равно
        // == - равно
        // != - не равно

        int middleModelHeight = 171;
        System.out.println(myHeight == middleModelHeight);
       System.out.println(myHeight < requiredHeight);
       //  тип boolean имеет всего два возможных значения true, false
        boolean result = (myHeight < requiredHeight);
        // можем сохранить получившееся значение в переменную, мы ее назвали резалт
        System.out.println(result);
        int unluckyNumber = 13;
        int currentNumber = 16;
        System.out.println("Warning:");
        // идемпотентность
        System.out.println(unluckyNumber != currentNumber);
        System.out.println("______________________");
        int kidHeight = 180;
        int reqHeight = 180;
        if (kidHeight != reqHeight) {
            System.out.println("You can go!");
        }
        else {
            System.out.println("You are not tall enough");
        }

        int fingers = 2;
        // если пальцев 2 - печатает "It's a victory";
        // если пальцев не 2 - "It is a loose";


    }
}
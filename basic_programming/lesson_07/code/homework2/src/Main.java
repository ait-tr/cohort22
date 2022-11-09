public class Main {
    public static void main(String[] args) {
        int monthNumber = 13;
        // 4 выдает в консоль spring
        // 5 выдает spring
        // 12 выдает winter
//        getSeason(monthNumber);
        getSeason2(monthNumber);
    }
    public static void getSeason2(int number) {
        if (number == 12 || number == 1 || number == 2) {
            System.out.println("winter");
            return; // можем поставить return тогда он не будет переходить к другим if
        }
        if (number >= 3 && number <= 5) {
            System.out.println("spring");
        }
        if (number >= 6 && number <= 8) {
            System.out.println("summer");
        }
        if (number >= 9 && number <= 11) {
            System.out.println("autumn");
        }
        if (number > 12 || number < 1) {
            System.out.println("Error: use numbers from 1 to 12");
        }
    }

    public static void getSeason(int number) {
        switch(number) {
            case 1:
                System.out.println("winter");
                break;
            case 2:
                System.out.println("winter");
                break;
            case 3, 4, 5:  // когда много случаев можем писать таким образом через запятую
                System.out.println("spring");
                break;
            case 6: // или можем писать таким, но он не предпочтителен
            case 7:
            case 8:
                System.out.println("summer");
                break;
            default:
                System.out.println("error");
                break;
        }

    }
}
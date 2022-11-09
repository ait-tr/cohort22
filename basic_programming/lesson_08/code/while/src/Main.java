public class Main {
    public static void main(String[] args) {
        System.out.println("__________________");
        int i = 1;
        while (i < 10) {
            System.out.println("Iteration: " + i);
            i++;
        }
        System.out.println("__________________");
        // в консоль вывелись числа от 5 до 17 включительно // например Number: 6
        int j = 5;
        while(j <= 17) {
            System.out.println("Number: " + j);
            j++;
            //i = i + 2;  // i +=2
        }
        System.out.println("__________________");
        /*
            Sugar
            i = i + 1  --> i += 1;
            i = i - 1  --> i -= 1;
            i = i * 2  --> i *= 2;
            i = i / 2  --> i /= 1;
            s = s + "hey" --> s += "hey";
         */

        // в консоль вывелось 10
        // 9
        // 8
        // ...
        // 3 Get ready!
        // 2
        // 1
        // Booom!
        System.out.println("__________________");
        // && - и, || - или,
        // ! - отрицание  - отрицание превращает true в false, и наоборот - false в тру
        // boolean isAdmin = !true;
        // System.out.println(isAdmin)  -->  выдал бы false
        // первый способ
        int h = 10;
        while (h >= 0) {
            if (!(h == 3 || h == 0)) { // все случаи, кроме двух когда h равно 3 и h равно 0
                System.out.println(h);
            }
            if (h == 3) {
                System.out.println("3 Get ready");
            }
            if (h == 0) {
                System.out.println("Boom");
            }
            h--;
        }
        System.out.println("__________________");

        // второй способ - конструкция else if
        int z = 10;
        while(z >= 0) {
            if (z == 3) {
                System.out.println("3 Get ready"); // этот код читается если первое условие истинно
            } else if (z == 0) {
                System.out.println("Boom"); // код выполянется когда первое усл не истинно, а второе условие истинно
            } else {
                System.out.println(z); // код выполняется только если первые условия на выполнились
            }
            z--;
        }
    }

}



import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Insect> insects = new ArrayList<>();
        insects.add(new Insect("Fly", 5, 2));
        insects.add(new Insect("Bee", 5000, 2));
        insects.add(new Insect("Spider", 8, 0));
        insects.add(new Insect("Dragonfly", 10000, 4));
        System.out.println("\nSort by name");

//        Collections.sort(insects, new InsectsByNameComparator());
//        for (Insect insect: insects) {
//            System.out.println(insect);
//        }
//        System.out.println("\nSort by number of eyes\n");
//
//        // метод .reversed() - сортирует в обратном порядке относительно исходного компаратора
//        Collections.sort(insects, new InsectsByNumberOfEyesComparator().reversed());
//        for (Insect insect: insects) {
//            System.out.println(insect);
//        }
//
//        System.out.println("\nSort by number of wings\n");
//
//        // еще метод можно вызвать вот так
//        insects.sort(new InsectsByWingsComparator());
//        for (Insect insect: insects) {
//            System.out.println(insect);
//        }


        // вторая часть занятия про сканер
        System.out.println("Как будем сортировать? 1. по имени 2. по количеству крыльев? 3. по количеству глаз?");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        scanner.close();
        switch(answer){
            case 1: {
                insects.sort(new InsectsByNameComparator());
                break;
            } case 2:{
                insects.sort(new InsectsByWingsComparator());
                break;
            } default: {
                insects.sort(new InsectsByNumberOfEyesComparator());
                break;
            }
        }
        for(Insect i: insects){
            System.out.println(i);
        }



    }


}
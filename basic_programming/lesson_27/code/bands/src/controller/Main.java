package controller;

import model.Band;
import model.Musician;

public class Main {
    public static void main(String[] args) {
        Musician john = new Musician("John", "Lennon", "rock", "piano", 22);
        System.out.println(john);
        Band beatles = new Band("The Beatles", new Musician[]{
                john,
                new Musician("Ringo", "Star", "rock", "drums", 23),
                new Musician("Paul", "McCartney", "rock", "bass", 20),
                new Musician("George", "Harrison", "rock", "guitar", 25)
        });
        System.out.println(beatles);

//        beatles.getMusicians()[1].setFirstName("Bingo");
//        // дополнительный код - как добраться до ринго и изменить его имя на бинго
//        System.out.println(beatles.getMusicians()[1]);
        Band itLegends = new Band("IT legends",
                new Musician[]{
                        new Musician("Nata", "Top", "it-grange", "windows", 25),
                        new Musician("Igor", "KingOfJava", "array-raggey", "mac", 26)
                }
        );
        System.out.println(itLegends);
        System.out.println(beatles.getOldestMember());
//        String oldestInLegends = beatles.getOldestMember().toString(); // дополнительно
//        System.out.println(oldestInLegends);
        System.out.println("______beatles before_____");
        System.out.println(beatles);
        System.out.println("______beatles after_____");
        beatles.addMusician(new Musician("Yoko", "Ono", "rock", "flute", 30));
        System.out.println(beatles);
        System.out.println("_____oldest____");
        System.out.println(beatles.getOldestMember());
    }
}
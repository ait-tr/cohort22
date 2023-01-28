import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void getUnicList() {
        List<String> people = new ArrayList<>();
        people.add("John");
        people.add("Bob");
        people.add("Kob");
        List<String> people2 = new ArrayList<>();
        people2.add("John");
        people2.add("Bob");
        people2.add("Kob");


        people2.sort(new Comparator<String>() {
                         @Override
                         public int compare(String o1, String o2) {
                             return o1.compareTo(o2);
                         }
                     });

        List<String> actual = Main.getUnicList(people);

        actual.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        Assertions.assertEquals(people2, actual);

    }


    @Test
    void removeByName(){
        List<String> people = new ArrayList<>();
        people.add("John");
        people.add("Bob");
        people.add("Kob");
        Main.removeByName(people);
        List<String> expected = new ArrayList<>();
        expected.add("John");
        expected.add("Kob");

        Assertions.assertEquals(people, expected);
    }



}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class MainTest {

    @Test
    void getSymmetricDifference() {
        List<Panda> pandas1 = new ArrayList<>(List.of(
                new Panda("Po", 23),
                new Panda("Boo", 25),
                new Panda("Ro", 15)));
        List<Panda> pandas2 = new ArrayList<>(List.of(
                new Panda("Po", 23),
                new Panda("Pica", 25),
                new Panda("Min", 15)));
        Set<Panda> expected = new HashSet<>(Set.of(
                new Panda("Boo", 25),
                new Panda("Ro", 15),
                new Panda("Pica", 25),
                new Panda("Min", 15)));
        Set<Panda> actual = Main.getSymmetricDifference(pandas1, pandas2);

        Assertions.assertEquals(expected, actual);

    }
}
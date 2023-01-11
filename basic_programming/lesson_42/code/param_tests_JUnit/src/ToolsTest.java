import com.beust.jcommander.Parameter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ToolsTest {
    @ParameterizedTest
    @ValueSource(strings = {"12", "123", "1233", "21333"})
    void rev(String str){
        Assertions.assertTrue(str.length()>3);
    }

    @Test
    void rev2 (){
        int[] exp = new int[]{10, 9, 12, 10, 5};
        int[] act = new int[]{10, 9, 12, 12, 5};

        assertArrayEquals(exp, act);
    }
    @Test
    void rev3(){
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Sweq");
        expected.add("Ksad");
        expected.add("Adas");
        ArrayList<String> actual = new ArrayList<>();
        actual.add("Sweq");
        actual.add("Ksad");
        actual.add("Adas");

        Assertions.assertEquals(expected, actual);


    }


}
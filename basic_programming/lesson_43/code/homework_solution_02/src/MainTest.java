import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("\"January makes me wanna fly\" --> \"Janua...\"")
    void shorten() {
        String result = "January makes me wanna fly";
        Assertions.assertEquals("Janua...", Main.shorten(result));
    }
    @Test
    @DisplayName("shorten(\"dog\") --> \"dog\"")
    void shorten2(){
        Assertions.assertEquals("dog", Main.shorten("dog"));
    }

    @Test
    @DisplayName("shorten(null) --> null")
    void shorten3(){
        Assertions.assertNull(Main.shorten(null));
    }

    @Test
    @DisplayName("shorten(\"hello\") --> \"hello\"")
    void shorten4(){
        Assertions.assertEquals("hello", Main.shorten("hello"));
    }
}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("157 --> 13")
    void sumOfDigits() {
        Assertions.assertEquals(13, Main.sumOfDigits(157));
    }

    @Test
    @DisplayName("8 --> 8")
    void sumOfDigits2() {
        Assertions.assertEquals(8, Main.sumOfDigits(8));
    }

    @Test
    @DisplayName("-131 --> 5")
    void sumOfDigits3() {
        Assertions.assertEquals(5, Main.sumOfDigits(-131));
    }

    @Test
    @DisplayName("1000 --> 1")
    void sumOfDigits4() {
        Assertions.assertEquals(1, Main.sumOfDigits(1000));
    }
}
import org.junit.jupiter.api.Assertions;   // проверьте, есть ли у вас необходимые импорты и подргужена ли библиотека
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CoffeeTest {
    @Test               // эта аннотация показывает, что это тестовый метод
//    @Disabled         // аннотация, чтобы временно "закомментитировать" тест
    @DisplayName("BruttoWeight 200 and wrappingWeight 50 should return 150")   // эта аннотация - позволяет указать сообщение - имя теста
    void getNetto() {
        double expectedResult = 150;
        Coffee coffee = new Coffee("Lavazza", 200, 50);
        Assertions.assertEquals(expectedResult, coffee.getNetto());
    }

    @Test
    @DisplayName("BruttoWeight 180 and wrappingWeight 160 should return 20")
    void getNetto2() {
        Coffee coffee = new Coffee("Lavazza", 180, 160);
        Assertions.assertEquals(20, coffee.getNetto());

    }
}
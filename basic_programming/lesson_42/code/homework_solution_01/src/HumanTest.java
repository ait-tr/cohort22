import org.junit.jupiter.api.*;

class HumanTest {
    static Human human;

    @BeforeAll                                     // только для демонстрации
    static void init() {
        System.out.println("Before all");          // этот кусочек выполяется один раз до тестов
        human = new Human(0);
    }

    @BeforeEach                                    // только для демонстрации
    void preTestAction() {
        System.out.println("Before each");         // этот код выполнится перед каждым тестом
        human.setAge(0);
    }

    @Test
    @DisplayName("age 1 returns \"infant\" ")
    void displayAgeCategory() {
        human.setAge(1);
        Assertions.assertEquals("infant", human.displayAgeCategory());
    }

    @Test
    @DisplayName("age 6 returns \"child\"")
    void displayAgeCategory2() {
        human.setAge(6);
        Assertions.assertEquals("child", human.displayAgeCategory());
    }

    @Test
    @DisplayName("age 13 returns \"teenager\"")
    void displayAgeCategory3() {
        Human eve = new Human(13);
        Assertions.assertEquals("teenager", eve.displayAgeCategory());
    }

    @Test
    @DisplayName("age 69 returns \"adult\"")
    void displayAgeCategory4() {
        Human semen = new Human(69);
        Assertions.assertEquals("adult", semen.displayAgeCategory());
    }

    @Test
    @DisplayName("age 75 returns \"senior\"")
    void displayAgeCategory7() {
        Human semen = new Human(75);
        Assertions.assertEquals("senior", semen.displayAgeCategory());
    }

    @Test
    @DisplayName("age -6 returns null")
    void displayAgeCategory5() {
        Human semen = new Human(-6);
        Assertions.assertNull(semen.displayAgeCategory());
    }

    @Test
    @DisplayName("age 130 returns null")
    void displayAgeCategory6() {
        Human semen = new Human(130);
        Assertions.assertNull(semen.displayAgeCategory());
    }

    @Test
    @DisplayName("age 70 returns true")
    void hasAnniversary() {
        human.setAge(70);
        Assertions.assertTrue(human.hasAnniversary());
    }

    @Test
    @DisplayName("age 35 returns true")
    void hasAnniversary2() {
        human.setAge(35);
        Assertions.assertTrue(human.hasAnniversary());
    }

    @Test
    @DisplayName("age 27 returns false")
    void hasAnniversary3() {
        human.setAge(27);
        Assertions.assertFalse(human.hasAnniversary());
    }

}
public class Human {
    private int age;

    public boolean hasAnniversary() {
        // если 10, 15, 25, 20 и  т.д.
        if (age % 5 == 0) {
            return true;
        }
        return false;
    }

    public String displayAgeCategory() {
        if (age < 0) {
            return null;
        }

        if (age <= 2) {
            return "infant";
        }
        if (age < 12) {
            return "child";
        }

        if (age < 18) {
            return "teenager";
        }

        if (age < 70) {
            return "adult";
        }

        if (age == 85) {
            return "rare person";
        }

        if (age < 120) {
            return "senior";
        }
        return null;
    }

    public String anotherMethode() {
        return "I am fake piece of code!";
    }

    public Human(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

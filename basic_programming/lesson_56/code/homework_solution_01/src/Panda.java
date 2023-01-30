import java.util.Objects;

public class Panda {
    private String name;
    private int age;

    public Panda(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Panda panda = (Panda) o;
        return age == panda.age && Objects.equals(name, panda.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Panda{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

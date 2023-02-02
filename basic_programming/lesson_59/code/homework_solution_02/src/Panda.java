import java.util.Objects;

public class Panda {
    private String name;
    private int weight;
    private int age;

    public Panda(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + "Panda{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", age=" + age +
                '}';
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
}

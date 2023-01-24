import java.util.Comparator;

public class PersonByAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.age, o2.age);
    }

    @Override
    public Comparator<Person> reversed() {
        return Comparator.super.reversed();
    }
}

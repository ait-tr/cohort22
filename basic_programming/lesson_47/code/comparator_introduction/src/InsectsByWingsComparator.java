import java.util.Comparator;

public class InsectsByWingsComparator implements Comparator<Insect> {

    @Override
    public int compare(Insect o1, Insect o2) {
        return Integer.compare(o1.getNumberOfWings(), o2.getNumberOfWings());
    }

    @Override
    public Comparator<Insect> reversed() {
        return Comparator.super.reversed();
    }
}

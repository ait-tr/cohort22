import java.util.Comparator;

public class InsectsByNumberOfEyesComparator implements Comparator<Insect> {

    @Override
    public int compare(Insect o1, Insect o2) {
        return Integer.compare(o1.getNumberOfEyes(), o2.getNumberOfEyes());
    }

    @Override
    public Comparator<Insect> reversed() {
        return Comparator.super.reversed();
    }
}

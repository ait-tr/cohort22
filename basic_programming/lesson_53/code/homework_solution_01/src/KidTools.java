import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KidTools {
    public static void sortByAge(List<Kid> kids) {
        Collections.sort(kids, new Comparator<Kid>() {
            @Override
            public int compare(Kid o1, Kid o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
    }

    public static void sortByNameAndThanByAge(List<Kid> kids) {
        Collections.sort(kids, new Comparator<Kid>() {
            @Override
            public int compare(Kid o1, Kid o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }.thenComparing(new Comparator<Kid>() {
            @Override
            public int compare(Kid o1, Kid o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        }));
    }

}

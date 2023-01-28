import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> people = new ArrayList<>();
        people.add("John");
        people.add("Bob");
        people.add("Kob");
        people.add("Bob");

        List<String> people2 = new ArrayList<>();
        people2.add("John");



        System.out.println(getUnicList(people));
        System.out.println(people);


        Set<String> result = getIntersection(people, people2);
        System.out.println(result);
        System.out.println(people.removeAll(people2));
        System.out.println(people);

        removeByName(people);
        System.out.println(people);

    }

    public static List<String> getUnicList(List<String> list) {
        HashSet<String> set = new HashSet<>(list);
        List<String> result = new ArrayList<>(set);
        return result;
    }

    public static Set<String> getIntersection(List<String> list, List<String> list2) {
        HashSet<String> intersection = new HashSet<>();
        for (String i : list) {
            if (list2.contains(i)){
                intersection.add(i);
            }
        }
        return intersection;
    }


    public static void removeByName(List<String> names) {
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Bob")) {
                iterator.remove();
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {

        Student harry = new Student(
                "Harry",
                "Potter",
                12,
                new int[]{4, 4, 3, 2, 4},
                new boolean[]{false, true, true, true, true}
        );
        System.out.println(harry);

        Student germiona = new Student(
                "Germiona",
                "Grenger",
                12,
                new int[]{5, 5, 5, 4, 5},
                new boolean[]{true, true, true, true, true}
        );

        Student ron = new Student(
                "Ron",
                "Wizley",
                12,
                new int[]{5, 4, 3, 5, 5},
                new boolean[]{true, false, true, false, true}
        );

        Faculty griffindor = new Faculty(
                "Griffindor",
                new Student[]{harry, germiona, ron}
        );
        System.out.println("________________");
        System.out.println(griffindor);
    }
}
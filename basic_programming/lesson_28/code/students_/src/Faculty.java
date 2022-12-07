import java.util.Arrays;

public class Faculty {
    private String title;
    private Student[] students;

    public String getTitle() {
        return title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Faculty(String title, Student[] students) {
        this.title = title;
        this.students = students;
    }

    @Override
    public String toString() {
//        return "Faculty " + title +
//                "\n Students\n" + Arrays.toString(students);
        String studentsStr = "";
        for (int i = 0; i < students.length; i++) {
            studentsStr = studentsStr + students[i];
        }
        return String.format("Faculty %s \n %s", title, studentsStr);
    }
}

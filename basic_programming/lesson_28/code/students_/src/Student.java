import java.util.Arrays;

public class Student {
    private String firstName;
    private String secondName;
    private int age;
    private int[] grades;
    private boolean[] attendance;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public int[] getGrades() {
        return grades;
    }

    public boolean[] getAttendance() {
        return attendance;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void setAttendance(boolean[] attendance) {
        this.attendance = attendance;
    }

    public Student(String firstName, String secondName, int age, int[] grades, boolean[] attendance) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.grades = grades;
        this.attendance = attendance;
    }

    public String toString() {
        String gradesStr = "";
        String attendanceStr = "";
        for (int i = 0; i < grades.length; i++) {
            if (i == grades.length - 1) {
                gradesStr = gradesStr + grades[i];
            } else {
                gradesStr = gradesStr + grades[i] + ", ";
            }
        }
        for (int i = 0; i < attendance.length; i++) {
            attendanceStr = attendanceStr + (attendance[i] ? "+" : "-") + " ";
        }
        // System.lineSeparator() - метод, который работает как \n - перенос строки
//        return System.lineSeparator() + "Student " + firstName + " " + secondName + ", " + age + " years old\n" +
//                " Grades: " + gradesStr +
//                "\n Attendance: " + attendanceStr;
        return String.format(
                "\nStudent %s %s, %d years old\n Grades: %s\n Attendance: %s \n",
                firstName,
                secondName,
                age,
                gradesStr,
                attendanceStr
        );
    }

    // Student Harry Potter, 17 years old
    //  Grades: 4, 4, 3, 2, 4
    //  Attendance: -, +, +, -, +

}

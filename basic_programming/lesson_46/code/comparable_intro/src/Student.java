public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        // Можно все прописать вручную
//        if (this.getId() < o.getId()){
//            return -6;
//        } else if (this.getId() == o.getId()){
//            return 0;
//        } else {
//            return 31234;
//        }
//        return this.getId() - o.getId();
        // Можно использовать метод compare
     return Integer.compare(this.id, o.id); // для int
//      return this.getName().compareTo(o.getName());   // для String
//        return this.getName().compareToIgnoreCase(o.getName()); // чтобы не учитывал регист
//        Double.compare()                                        // для дабла точно также
    }
}

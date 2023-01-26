public class Kid {
    private String name;
    private String parentName;
    private String group;
    private int age;

    public static int age2;
    private double height;

    public Kid(String name, String parentName, String group, int age, double height) {
        this.name = name;
        this.parentName = parentName;
        this.group = group;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Kid{" +
                "name='" + name + '\'' +
                ", parentName='" + parentName + '\'' +
                ", group='" + group + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getParentName() {
        return parentName;
    }

    public String getGroup() {
        return group;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void ourMethod(){
        age2 = 5;
    }

    public static void ourMethod2(Kid kid){
        System.out.println(kid.height);
    }


}

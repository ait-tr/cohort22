package model;

public class Programmer {
    private int id; // сделаем это приватным
    public String firstName;
    public String secondName;
    public int age;
    private double salary; // сделали поле приватным
    // getters
    public double getSalary() {
        return this.salary;
    }
    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    public Programmer(){
    }

    // создали конструктор по умолчанию
    public Programmer(int id, String firstName, String secondName, int age, double salary){
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.salary = salary;

    }


    public void hello() {
        System.out.println("I am " + firstName + " "+ secondName);
        System.out.println("I am " + age);
//        System.out.println(salary == 0 ? "" : "Salary: " + salary);
    }
}

package model;

public class Mechanic {
    private String name;
    private double salary;
    private int experience;
    private double account;
    public void changeTires(Car car, Tire tire) {
        car.setTire(tire); // меняет покрышки
        salary = salary + 50 * (1 + (experience * 0.05));
    }
    public void checkSalary() {
        System.out.println(
                String.format(
                        "%s salary is %.2f",
                        name,
                        salary
                )
        );
    }

    public Mechanic(String name, double salary, int experience, double account){
        this.name = name;
        this.salary = salary;
        this.experience = experience;
        this.account = account;
    }

//    private int methodeA(){ // мы можем сделать приватный метод
//        return 9;           // чтобы использовать его внутри класса
//                            // как вспомогательный для другого метода, например для methodeB
//    }
//
//    public int methodeB(){  //
//        return 8 + methodeA();
//    }
}

package model;

public class Dog {
    public int age;  // поля класса Dog (fields, attributes)
    public double weight; // пишем public чтобы можно было иметь доступ из других классов
    public boolean isAgressive;
    public String name;
    public String breed;
    public boolean isMale;


    // конструктор по умолчанию
    public Dog() {
    }
    // конструктор, когда только имя
    public Dog(String name) {
        this.name = name;
    }
    // конструктор, когда имя и возраст
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    // конструктор в котором все свойства прописаны
    public Dog(String name, int age, double weight, boolean isMale, boolean isAgressive, String breed){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isMale = isMale;
        this.isAgressive = isAgressive;
        this.breed = breed;
    }

    public void displayDog() { // без static
        System.out.println("******************");
        System.out.println("Name: " + name + " Breed: " + breed );
        System.out.println("Weight: " + weight + " Age: " + age + " Woof" );
        System.out.println("Sex: " + (isMale ? "Boy" : "Girl")); // можем использовать тернарник
    }
}

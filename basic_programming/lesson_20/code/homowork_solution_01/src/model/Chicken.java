package model;

public class Chicken {
    public String name;
    public double weight;
    public boolean isMale;
    private double price;
    // геттеры
    public double getPrice(){
        return this.price;
    }
    // сеттер
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    // конструкторы
    public Chicken(){
    }
    public Chicken(String name1, double weight1, boolean isMale1, double price1){
        this.name = name1; // this вместо имени экземпляра kurica.name = "Kurica"
        this.weight = weight1;
        this.isMale = isMale1;
        this.price = price1;
    }
    public Chicken(String name, double weight, boolean isMale){
        this.name = name;
        this.weight = weight;
        this.isMale = isMale;
        // если не передаем стоимость, она считается исходя из веса
        this.price = weight * 0.75;
    }
    // прочие методы

    public void run(){
        this.weight = this.weight - this.weight * 0.05;
    }
    public void eatWorms(int numberOfWorms){
        this.weight = this.weight + 0.1 * numberOfWorms; // по 100 грамм за червяка
    }
    public void info() {
        System.out.println(
                "Name: " + name +
                " Weight: " + weight +
                " Sex: " + (isMale ? "rooster" : "hen")
        );
    }
}

package model;

public class Farmer {
    public String name;

    public Farmer(String name){
        this.name = name;
    }
    public double countAverageOrangeDiameter(OrangeTree tree) {
        if (tree.getOranges().length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < tree.getOranges().length; i++) {
            sum += tree.getOranges()[i].getDiameter();
        }                                      // здесь мы посчитали сумму
        return sum / tree.getOranges().length; // здесь мы получим среднее разделив сумму на количество элементов
    }
}

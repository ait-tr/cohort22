public class Coffee {
    public String title;
    public double bruttoWeight;           // вес всего продукта брутто
    public double wrappingWeight;         // вес бумажной упаковка

    public double getNetto() {
        return bruttoWeight - wrappingWeight;
    }

    public Coffee(String title, double bruttoWeight, double wrappingWeight) {
        this.title = title;
        this.bruttoWeight = bruttoWeight;
        this.wrappingWeight = wrappingWeight;
    }
}

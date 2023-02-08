public enum Leather {
    COW(50), CROCODILE(1000), SHEEP(70), FISH(500);
    int price;

    public int getPrice() {
        return price;
    }
    Leather(int price) {
        this.price = price;
    }
}

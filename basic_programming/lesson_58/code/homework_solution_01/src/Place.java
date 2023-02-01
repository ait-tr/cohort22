public class Place {
    private int capacity;
    private String adress;

    public Place(int capacity, String adress) {
        this.capacity = capacity;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return String.format("Место: %s Вместимость: %d", adress, capacity);
    }
}

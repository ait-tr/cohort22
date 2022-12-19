package register;

// Класс "Строка чека"
class Row {
    private String item;
    private double price;
    private double amount;
    private double total;

    protected Row(String item, double price, double amount) {
        this.item = item;
        this.price = price;
        this.amount = amount;
        total = price * amount;
    }

    // Красиво вывести строку чека на экран
    @Override
    public String toString() {
        return "Товар: " + item + ", цена: " + price + ", количество: " + amount + ", итог: " + total + "\n";
    }

    // Получить общую стоимость товара в этой строке
    protected double getTotal() {
        return total;
    }
}

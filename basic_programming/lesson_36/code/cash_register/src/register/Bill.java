package register;

// Класс "Чек"
class Bill {
    Row[] rows = new Row[10]; // строки чека
    int rowsCount = 0; // количество строк в чеке, оно же - индекс первого пустого элемента в rows

    // добавить строку в текущий чек
    protected void addRow(String item, double price, double amount) {
        if (rowsCount == rows.length) {
            // массив rows заполнен, не можем больше ничего добавить
            Row[] newRows = new Row[rows.length * 2]; // делаем новый массив в два раза больше
            for (int i = 0; i < rowsCount; i++) {
                newRows[i] = rows[i]; // копируем ссылки из старого массива в новый
            }
            rows = newRows; // ссылка rows на массив строк теперь ведёт на новый (большой) массив
        }

        rows[rowsCount] = new Row(item, price, amount); // положили новую строку в первый незаполненный элемент
        rowsCount++; // увеличили счётчик
    }
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < rowsCount; i++) {
            result += rows[i];
        }
        result += "Итог: " + getTotal() + "\n"; // добавляем в чек общий итог
        return result;
    }

    // общая сумма чека
    protected double getTotal() {
        double total = 0.0; // общая сумма чека
        for (int i = 0; i < rowsCount; i++) {
            total += rows[i].getTotal(); // добавить общую стоимость товара в этой строке
        }
        return total;
    }
}

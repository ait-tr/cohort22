package register;

// Класс "Кассовый аппарат"
// аппарат формирует чеки и итоговый отчёт (определим позже)
// чеки состоят из строк:
// - название
// - количество
// - цена (за единицу товара)
// - стоимость (за указанное количество)
// и общего итога (только стоимость)
public class Register {
    private Bill[] bills = new Bill[10]; // закрытые чеки
    private int billsCount = 0; // количество закрытых чеков
    private Bill currentBill = new Bill(); // текущий чек

    // для тех, кто был на занятии или смотрит запись
    // раньше currentBill не было, текущим был чек bills[billsCount - 1]
    // в него мы добавляли строчки
    // его печатали при закрытии чека
    // его не учитывали в отчёте (так как последний начатый чек -- всегда пустой)
    // его не учитывали в общей сумме (так как последний начатый чек -- всегда пустой)

    // теперь currentBill отдельно, все чеки из bills - правильные и законченные
    // в currentBill мы добавляем строчки
    // currentBill печатаем при закрытии чека
    // его и так не учитываем в отчёте, только bills (теперь уже все)
    // его и так не учитываем в общей сумме, только bills (теперь уже все)

    // сохранить текущий чек в первой незаполненной ячейке массива bills
    // и начать новый в bill
    private void storeBill() {
        if (billsCount == bills.length) {
            // массив bills заполнен, не можем больше ничего добавить
            Bill[] newBills = new Bill[bills.length * 2]; // делаем новый массив в два раза больше
            for (int i = 0; i < billsCount; i++) {
                newBills[i] = bills[i]; // копируем ссылки из старого массива в новый
            }
            bills = newBills; // ссылка bills на массив счетов теперь ведёт на новый (большой) массив
        }

        bills[billsCount] = currentBill; // положили текущий (завершаемый) в первый незаполненный элемент
        billsCount++; // увеличили счётчик

        currentBill = new Bill(); // открыли новый (текущий) чек
    }

    // конструктор
    public Register() {
        System.out.println("Кассовый аппарат включён");
    }

    // добавить строку в текущий чек
    public void addRow(String item, double price, double amount) {
        currentBill.addRow(item, price, amount);
    }

    // закрыть и напечатать чек, автоматически начнётся новый
    public void closeBill() {
        System.out.println("=== Чек ===");
        System.out.println(currentBill); // напечатать текущий чек
        storeBill(); // сохранить текущий чек и начать новый
    }

    // общая сумма чеков
    protected double getTotal() {
        double total = 0.0; // общая сумма чеков
        for (int i = 0; i < billsCount; i++) {
            total += bills[i].getTotal(); // добавить общую стоимость товара в этом чеке
        }
        return total;
    }

    // получить итоговый отчёт (определим позже)
    public String getReport() {
        String result = "=== Итоговый отчёт ===\n";
        result += "Количество чеков: " + billsCount + "\n";
        result += "Общая сумма: " + getTotal() + "\n";
        // ДЗ: добавить "средний чек", лучше считать сумму отдельным методом getAverage(), как getTotal()
        return result;
    }
}

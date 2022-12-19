import register.Register;

public class Main {
    // написать программу, реализующую простой кассовый аппарат
    // аппарат формирует чеки и итоговый отчёт (определим позже)
    // чеки состоят из строк:
    // - название
    // - количество
    // - цена (за единицу товара)
    // - стоимость (за указанное количество)
    // и общего итога (только стоимость)
    public static void main(String[] args) {
        Register cashRegister = new Register();
        cashRegister.addRow("Соль", 1.6, 1);
        cashRegister.addRow("Сахар", 3.5, 2);
        cashRegister.closeBill();
        cashRegister.addRow("Помидоры", 2.7, 1.5);
        cashRegister.addRow("Огурцы", 1.7, 1.5);
        cashRegister.addRow("Лосось", 9.8, 0.3);
        cashRegister.closeBill();
        System.out.println(cashRegister.getReport());
    }
}

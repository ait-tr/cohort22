import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Printable> printableArrayList = new ArrayList<>();
        printableArrayList.add(new Book("Harry Potter"));
        printableArrayList.add(new Magazine("Cosmopolitan"));
//        System.out.println(printableArrayList);

        Magazine.printMagazines(printableArrayList);

        /*
        Релиз 1
         Определить интерфейс Printable, содержащий метод void print();
         Определить класс Book, реализующий интерфейс Printable;
         Определить класс Magazine, реализующий интерфейс Printable;

        Релиз 2
         Создайте ArrayList<Printable>, который будет содержать книги и журналы
         Распечатайте элементы ArrayList

         Релиз 3

        Создать статический метод printMagazines(ArrayList<Printable>printable) в классе Magazine, который выводит на консоль названия только журналов.
        Создать статический метод printBooks(ArrayList<Printable>printable) в классе Book, который выводит на консоль названия только книг. Используем оператор instanceof


         */
    }
}
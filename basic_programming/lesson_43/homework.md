##  Homework

### Задание 1 Книги и журналы
Релиз 1   
Определить интерфейс Printable, содержащий метод void print();  
Определить класс Book, реализующий интерфейс Printable;  
Определить класс Magazine, реализующий интерфейс Printable;

Релиз 2  
Создайте ArrayList<Printable>, который будет содержать книги и журналы;
Распечатайте элементы ArrayList;

Релиз 3

Создать статический метод printMagazines(ArrayList<Printable>printable) в классе Magazine, который выводит на консоль названия только журналов.
Создать статический метод printBooks(ArrayList<Printable>printable) в классе Book, который выводит на консоль названия только книг. Используем оператор instanceof


### Задание 2 Рыцари и священники
Создайте класс рыцарь Knight, наследующий интерфейсы Noble(благородный) и CanFight(может сражаться).  
Пусть в интерфейсе CanFight будет метод fight();  
Создайте класс Cleric наследующий интерфейс Noble.  
Создайте у Knight метод protect(Noble noble). Пусть внутри этого метода вызывается метод fight(), который бы выводил в консоль какой-нибудь текст.
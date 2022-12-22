import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Natalia Tropina");
        names.add("Jurij Gil");
        names.add("Alyona Dyak");
        System.out.println(names);
        ArrayList<String> blackList = new ArrayList<>();
        blackList.add("John Butcher");     // добавить элемент
        blackList.add("Dan Brown");
        blackList.add("Jurij Gil");
        names.addAll(blackList);                 // addAll - можно добавить массив
        System.out.println(names);
        System.out.println(names.get(0));        // достать по индексу
        names.set(2, "Bob Marley");              // заменить элемент на новый
        System.out.println(names);
        names.add(0, "Igor");       // добавить элемент по индексу - другие съезжают
        System.out.println(names);
        names.add("Igor");

        System.out.println(names);
        names.remove("Igor");                 // удалить по значению первого
        System.out.println(names);
        names.remove(0);                   // удалить по индексу
        System.out.println(names);
        names.add("Igor");
        blackList.remove(0);
        names.removeAll(blackList);             // удалить из arrayList элементы по списку
        System.out.println(names);
        System.out.println(names.size());       // узнать длину
        int x = names.size() - 1;               // получили индекс последнего элемента
        names.get(names.size() - 1);            // получили последний элемент
        for (int i = 0; i < names.size(); i++) {   // можем пройтись циклом при помощи get, size
            System.out.println(names.get(i));
        }
        names.clear();                          // метод удаляет все элементы
        System.out.println(names);
        names.add("John Snow");
        names.add("Johnny Winter");
        names.add("Johnny Winter");
        System.out.println(names.indexOf("Johnny Winter"));  // индекс первого вхождения объекта
        System.out.println(names.indexOf("Johnny Winter"));  // индекс второго вхождения объекта
        for (String name : names) {             // цикл for-each // тип; имя переменной для текущего элемента, имя массива или ArrayList
            System.out.println(name);
        }


    }
}
public class CustomArrayList {
    int size = 0;           // заполненные ячейки
    int capacity = 10;      // длинна массива
    String[] array = new String[capacity]; // сам массив

    public int size() {
        return size;        // метод возвращает длину массива
    }

    public void add(String str) {
        if (capacity == size) {
            capacity *= 2;
            String[] newArray = new String[capacity]; // Создали массив в два раза длиннее.
            for (int i = 0; i < size; i++) {           // Копируем значения из строго массива.
                newArray[i] = array[i];               //
            }
            array = newArray;                         // Заменили массив на новый.
        }
        array[size] = str;
        size++;
    }

    public void removeByIndex(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result = result + " " + array[i];
        }
        return result;
    }
}

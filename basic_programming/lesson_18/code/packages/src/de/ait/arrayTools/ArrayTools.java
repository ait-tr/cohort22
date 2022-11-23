package de.ait.arrayTools;
import java.util.Arrays;

public class ArrayTools {
    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    public static void reverse(int[] array) {
        for(int i = 0; i < array.length/2; i++){
            int storage = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = storage;
        }
    }
}
// создайте пакет stringTools
// в нем создайте класс StringTools
// внутри класса пропишите метод whisper -
// который принимает строку и делает буквы строчными - возвращает новую строку

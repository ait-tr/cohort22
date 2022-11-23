package de.ait.stringTools;

public class StringTools {
    public static String whisper (String text) {
        return text.toLowerCase();
    }
    // напишите метод типа массив String[]
    // если элемент массива начинается с char 'f'
    // то он меняет слово, чтобы они было большими буквами
    public static String[] shoutF (String[] array) {
        String[] newArray = new String[array.length];
        for(int i = 0; i < array.length; i++) {
           if(array[i].charAt(0) == 'f') {
               newArray[i] = array[i].toUpperCase();
           } else {
               newArray[i] = array[i];
           }
        }
        return newArray;
    }
}

package de.ait.specialTools;

import java.util.Arrays;

public class SpecialTools {
    public static void print(String[] array) {
        System.out.println(Arrays.toString(array));
    }
    public static String[] sipherP(String[] array){
        String[] newArray = new String[array.length];
        for(int i = 0; i < array.length; i++){
            if (array[i].charAt(0) == 'p'){
                newArray[i] = array[i].replaceAll("a", "d");
            } else {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }


}

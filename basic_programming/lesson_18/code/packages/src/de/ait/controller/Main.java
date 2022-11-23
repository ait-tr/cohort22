package de.ait.controller;

import de.ait.arrayTools.ArrayTools;
import de.ait.stringTools.StringTools;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {8, 9, 18, 19, 20};
        ArrayTools.print(numbers);
        ArrayTools.reverse(numbers);
        ArrayTools.print(numbers);
        String phrase = "Hey, I'AM HERE";
        String phrase2 = StringTools.whisper(phrase);
        System.out.println(phrase2);
        String[] words = {"rights", "human", "freedom", "opportunities", "kindness"};
        String[] words2 = StringTools.shoutF(words);

        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(words2));

    }
}
package de.ait.controller;
import de.ait.specialTools.SpecialTools;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"apple", "place", "dog", "plane"};
        SpecialTools.print(arr);
        String[] arr1 = SpecialTools.sipherP(arr);
        SpecialTools.print(arr1);
    }
}
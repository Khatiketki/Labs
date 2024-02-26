package edu.neu.mgen;

import java.util.ArrayList;

public class LabArrayList {
    public static void main(String[] args) {
        // Initialize ArrayList with 5 names
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Emily");

        // Initialize ArrayList to store switched names
        ArrayList<String> switchedNames = new ArrayList<>();

        // Switch first and last letters in each name
        for (String name : names) {
            switchedNames.add(switchFirstAndLastLetters(name));
        }

        // Print original and switched names
        System.out.print("Names = {");
        printArrayList(names);
        System.out.println("}");

        System.out.print("Names (switched) = {");
        printArrayList(switchedNames);
        System.out.println("}");
    }

    // Method to switch first and last letters in a single name
    private static String switchFirstAndLastLetters(String name) {
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);
        String middle = name.substring(1, name.length() - 1).toLowerCase();
        return Character.toUpperCase(lastChar) + middle + Character.toLowerCase(firstChar);
    }

    // Method to print ArrayList elements separated by comma
    private static void printArrayList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}

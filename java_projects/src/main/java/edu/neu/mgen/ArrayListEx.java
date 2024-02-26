package edu.neu.mgen;
import java.util.ArrayList;
public class ArrayListEx {
    public static void main(String[] args) {
    // Create an ArrayList of strings
    ArrayList<String> cities = new ArrayList<>();
    // Add strings to the ArrayList
    cities.add("Austin");
    cities.add("Houston");
    cities.add("Oakland");
    cities.add("Paris");
    cities.add("San Francisco");
    cities.add("Seattle");
    // Print the ArrayList before removing "Paris"
    System.out.println("Cities before removing 'Paris': " + cities);
    // Remove "Paris" from the ArrayList
    cities.remove("Paris");
    
    // Print the ArrayList after removing "Paris"
    System.out.println("Cities after removing 'Paris': " + cities);
    }
}
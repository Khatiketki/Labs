package edu.neu.mgen;

import java.util.Scanner;

public class WordClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter any word:");
        long startTime = System.currentTimeMillis(); // Get start time
        
        String word = scanner.nextLine().trim();
        
        long endTime = System.currentTimeMillis(); // Get end time
        double reactionTime = (endTime - startTime) / 1000.0; // Convert to seconds
        
        if (word.isEmpty()) {
            System.out.println("You did not enter any word");
            return;
        }
        
        int length = word.length();
        String classification;
        if (length <= 5) {
            classification = "short";
        } else if (length <= 10) {
            classification = "medium";
        } else {
            classification = "long";
        }
        
        System.out.println("Your word is " + word);
        System.out.println("The length of the word is " + length);
        System.out.println("It is a " + classification + " word");
        System.out.println("Your reaction time is " + reactionTime + " seconds");
    }
}

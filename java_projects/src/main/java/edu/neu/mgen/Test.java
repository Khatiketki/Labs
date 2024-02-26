package edu.neu.mgen;

import java.util.Scanner;

public class Test {   
     public static void main(String[] args)
      {
        // Declare and initialize variables
        int intVar1 = 5, intVar2 = 10;
        long longVar1 = 10000000000L, longVar2 = 20000000000L;
        double doubleVar1 = 3.14, doubleVar2 = 2.71828;
        boolean booleanVar1 = true, booleanVar2 = false;
        char charVar1 = 'A', charVar2 = 'B';

        // Convert int variables to long
        long intVar1AsLong = (long) intVar1;
        long intVar2AsLong = (long) intVar2;

        // Convert long variables to int
        int longVar1AsInt = (int) longVar1;
        int longVar2AsInt = (int) longVar2;

        // Enter values for variables from the terminal
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for doubleVar1: ");
        doubleVar1 = scanner.nextDouble();

        System.out.print("Enter a value for charVar1: ");
        charVar1 = scanner.next().charAt(0);

        // Arithmetic and logical operations
        int sumResult = intVar1 + intVar2;
        long differenceResult = longVar1 - longVar2;
        double productResult = doubleVar1 * doubleVar2;
        double divisionResult = (double) longVar2 / intVar2;
        long modulusResult = longVar2 % intVar2;
        double powerResult = Math.pow(intVar1, intVar2);
        boolean booleanAndResult = booleanVar1 && booleanVar2;
        boolean booleanOrResult = booleanVar1 || booleanVar2;
        boolean booleanNotResult = !booleanVar1;

        // Print the results
        System.out.println(charVar1);
        System.out.println(charVar2);
        System.out.println("Sum Result: " + sumResult);
        System.out.println("Difference Result: " + differenceResult);
        System.out.println("Product Result: " + productResult);
        System.out.println("Division Result: " + divisionResult);
        System.out.println("Modulus Result: " + modulusResult);
        System.out.println("Power Result: " + powerResult);
        System.out.println("Boolean AND Result: " + booleanAndResult);
        System.out.println("Boolean OR Result: " + booleanOrResult);
        System.out.println("Boolean NOT Result: " + booleanNotResult);


}
}
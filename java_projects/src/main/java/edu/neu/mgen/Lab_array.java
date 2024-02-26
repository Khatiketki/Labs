package edu.neu.mgen;

public class Lab_array {
    public static void main(String[] args) {
        // Initiate arrays x and y
        int[] x = {5, 8, 3, 10, 6};
        int[] y = {2, 9, 12, 4, 7};

        // Create array z with max of respective elements of x and y
        int[] z = new int[5];
        for (int i = 0; i < x.length; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        // Print arrays nicely
        System.out.print("Array x = {");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
            if (i < x.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Array y = {");
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]);
            if (i < y.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Array z = x + y = {");
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]);
            if (i < z.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}

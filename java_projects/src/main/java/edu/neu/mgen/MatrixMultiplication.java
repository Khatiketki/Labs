package edu.neu.mgen;

public class MatrixMultiplication {
    
    // Function to check if two matrices can be multiplied
    public static boolean canMultiply(int[][] A, int[][] B) {
        return A[0].length == B.length;
    }
    
    // Function to multiply two matrices
    public static int[][] multiply(int[][] A, int[][] B) {
        if (!canMultiply(A, B)) {
            System.out.println("Matrices cannot be multiplied.");
            return null;
        }
        
        int m = A.length;
        int n = B[0].length;
        int p = B.length;
        int[][] result = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < p; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
    
    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] A = {{2, 3, 4},
                     {3, 4, 5}};
                     
        int[][] B = {{1, 2},
                     {3, 4},
                     {5, 6}};
        
        // Check if matrices can be multiplied
        if (canMultiply(A, B)) {
            // Multiply matrices
            int[][] result = multiply(A, B);
            
            // Print result
            if (result != null) {
                System.out.println("Result of A * B:");
                printMatrix(result);
            }
        } else {
            System.out.println("Matrices cannot be multiplied.");
        }
    }
}

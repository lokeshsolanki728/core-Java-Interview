package com.somethingnew;
public class Swap2DArrayContents {
    public static void main(String[] args) {
        // Two 2D arrays of the same size
        int[][] array1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] array2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        System.out.println("Before swapping:");
        print2DArray(array1);
        print2DArray(array2);

        // Swapping element by element
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                int temp = array1[i][j];
                array1[i][j] = array2[i][j];
                array2[i][j] = temp;
            }
        }

        System.out.println("\nAfter swapping:");
        print2DArray(array1);
        print2DArray(array2);
    }

    // Helper method to print a 2D array
    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

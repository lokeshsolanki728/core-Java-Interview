package com.somethingnew;
public class RecursionExample {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) { 
            return 1;
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        int number = 5; 
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
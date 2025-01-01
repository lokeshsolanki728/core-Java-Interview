package com.somethingnew;

import java.util.Scanner;

public class SwitchCaseCalculator {

    public static void main(String[] args) {
        char[] operators = {'+', '-', '*', '/'};
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your first Number: ");
        int x = sc.nextInt();
        
        System.out.println("Enter your second Number: ");
        int y = sc.nextInt();
        
        double result;
        
        for (int i = 0; i < operators.length; i++) { // Removed the extra semicolon
            switch (operators[i]) {
                case '+':
                    result = x + y;
                    System.out.println("Addition is: " + result);
                    break;
                case '-':
                    result = x - y;
                    System.out.println("Subtraction is: " + result);
                    break;
                case '*':
                    result = x * y;
                    System.out.println("Multiplication is: " + result);
                    break;
                case '/':
                    if (y != 0) { // Check for division by zero
                        result = (double)x / y;
                        System.out.println("Division is: " + result);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                default:
                   System.out.println("Invalid operator");
            }
        }
    }
}
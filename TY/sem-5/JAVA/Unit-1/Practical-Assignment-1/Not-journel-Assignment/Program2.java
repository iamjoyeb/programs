// Program 2: Write a java program to enter two number by the user and perform
// the addition, subtraction, multiplication and division.

import java.util.Scanner;

class Program2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division: Cannot divide by zero");
        }
        
        sc.close();
    }
}
/* 
 * SAMPLE OUTPUT:
 * Enter first number: 15
 * Enter second number: 4
 * Addition: 19.0
 * Subtraction: 11.0
 * Multiplication: 60.0
 * Division: 3.75
 * 
 * (If b = 0): Division: Cannot divide by zero
 */

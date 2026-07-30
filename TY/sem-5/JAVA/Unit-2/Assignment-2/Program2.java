// Q2. Write a Java program to create a menu-driven calculator using switch case.
//     The menu should display Addition, Subtraction, Multiplication and Division.
//     Accept two numbers and an operation choice from the user.

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;

        System.out.print("Enter first number: ");
        a = sc.nextDouble();
        System.out.print("Enter second number: ");
        b = sc.nextDouble();

        System.out.println("\n--- Menu ---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}

/*
Output:
Enter first number: 25
Enter second number: 5

--- Menu ---
1. Addition
2. Subtraction
3. Multiplication
4. Division
Enter your choice: 1
Result: 30.0
*/

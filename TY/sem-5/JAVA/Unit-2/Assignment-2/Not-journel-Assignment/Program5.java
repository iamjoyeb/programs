import java.util.Scanner;

// Q5. Write a Java program to perform arithmetic operations.
//     Accept two numbers and an operator (+, -, *, /) interactively
//     and display the result.

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Arithmetic Operations");
        System.out.println("======================");

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator (+ - * /): ");
        String operator = sc.next();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        switch (operator) {
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        sc.close();
    }
}

/*
Output:
Arithmetic Operations
======================
Enter first number: 10
Enter operator (+ - * /): +
Enter second number: 20
Result: 30.0

Enter first number: 15
Enter operator (+ - * /): *
Enter second number: 4
Result: 60.0
*/

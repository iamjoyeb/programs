import java.util.Scanner;

// Program 22: Write a program that will calculate division of two numbers.

class Program22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Division of Two Numbers");
        System.out.println("========================");

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            double quotient = a / b;
            System.out.println("First number: " + a);
            System.out.println("Second number: " + b);
            System.out.println("Division: " + quotient);
        }

        sc.close();
    }
}
/*
 * SAMPLE OUTPUT:
 * Division of Two Numbers
 * ========================
 * Enter first number: 100
 * Enter second number: 3
 * First number: 100.0
 * Second number: 3.0
 * Division: 33.333333333333336
 *
 * (If b = 0): Division by zero is not allowed.
 */

import java.util.Scanner;

// Program 21: Write a program that will calculate multiplication of two numbers.

class Program21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Multiplication of Two Numbers");
        System.out.println("==============================");

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double product = a * b;

        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Multiplication: " + product);

        sc.close();
    }
}
/*
 * SAMPLE OUTPUT:
 * Multiplication of Two Numbers
 * ==============================
 * Enter first number: 8
 * Enter second number: 12
 * First number: 8.0
 * Second number: 12.0
 * Multiplication: 96.0
 */

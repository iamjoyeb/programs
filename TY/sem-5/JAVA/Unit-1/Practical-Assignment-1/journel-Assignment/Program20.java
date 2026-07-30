import java.util.Scanner;

// Program 20: Write a program that will calculate subtraction of two numbers.

class Program20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Subtraction of Two Numbers");
        System.out.println("===========================");

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double diff = a - b;

        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Subtraction: " + diff);

        sc.close();
    }
}
/*
 * SAMPLE OUTPUT:
 * Subtraction of Two Numbers
 * ===========================
 * Enter first number: 50
 * Enter second number: 15
 * First number: 50.0
 * Second number: 15.0
 * Subtraction: 35.0
 */

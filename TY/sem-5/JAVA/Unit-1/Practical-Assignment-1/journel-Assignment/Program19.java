import java.util.Scanner;

// Program 19: Write a program that will calculate addition of two numbers.

class Program19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Addition of Two Numbers");
        System.out.println("========================");

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double sum = a + b;

        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Addition: " + sum);

        sc.close();
    }
}
/*
 * SAMPLE OUTPUT:
 * Addition of Two Numbers
 * ========================
 * Enter first number: 25
 * Enter second number: 17
 * First number: 25.0
 * Second number: 17.0
 * Addition: 42.0
 */

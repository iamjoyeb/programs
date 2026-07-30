import java.util.Scanner;

// Program 23: Write a java program to calculate simple interest.

class Program23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Interest Calculator");
        System.out.println("===========================");

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter time (in years): ");
        double time = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);

        sc.close();
    }
}
/*
 * SAMPLE OUTPUT:
 * Simple Interest Calculator
 * ===========================
 * Enter principal amount: 10000
 * Enter rate of interest: 5.5
 * Enter time (in years): 3
 * Principal: 10000.0
 * Rate: 5.5%
 * Time: 3.0 years
 * Simple Interest: 1650.0
 */

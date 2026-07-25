// Program 4: Write a java program to calculate the simple interest.

import java.util.Scanner;

class Program4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of interest (per annum): ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time period (years): ");
        double time = sc.nextDouble();
        
        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("Simple Interest: " + simpleInterest);
        
        sc.close();
    }
}
/* 
 * SAMPLE OUTPUT:
 * Enter Principal amount: 10000
 * Enter Rate of interest (per annum): 5.5
 * Enter Time period (years): 3
 * Simple Interest: 1650.0
 */

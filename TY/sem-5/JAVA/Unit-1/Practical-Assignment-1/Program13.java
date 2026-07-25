// Program 13: Write a java program to find out factorial of given number.

import java.util.Scanner;

class Program13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long factorial = 1;
        
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of " + num + " is: " + factorial);
        
        sc.close();
    }
}
/* 
 * SAMPLE OUTPUT:
 * Enter a number: 5
 * Factorial of 5 is: 120
 * (Explanation: 5! = 1 × 2 × 3 × 4 × 5 = 120)
 */

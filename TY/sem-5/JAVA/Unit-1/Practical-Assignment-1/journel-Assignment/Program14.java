// Program 14: Writ a program to print a Fibonacci series using for loop.

import java.util.Scanner;

class Program14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        // Handle edge cases
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }
        
        int a = 0, b = 1;
        
        if (n == 1) {
            System.out.println("Fibonacci Series: " + a);
        } else {
            System.out.print("Fibonacci Series: " + a + ", " + b);
            for (int i = 2; i < n; i++) {
                int next = a + b;
                System.out.print(", " + next);
                a = b;
                b = next;
            }
            System.out.println();
        }
        
        sc.close();
    }
}
/* 
 * SAMPLE OUTPUT (for n=7):
 * Enter the number of terms: 7
 * Fibonacci Series: 0, 1, 1, 2, 3, 5, 8
 * 
 * SAMPLE OUTPUT (for n=1):
 * Enter the number of terms: 1
 * Fibonacci Series: 0
 * 
 * SAMPLE OUTPUT (for n=0):
 * Enter the number of terms: 0
 * Please enter a positive number.
 */

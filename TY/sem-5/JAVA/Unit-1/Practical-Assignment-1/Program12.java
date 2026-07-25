// Program 12: Write a program to find out sum of N numbers using any loop.
// Dynamic version: User specifies how many numbers to sum.

import java.util.Scanner;

class Program12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many numbers do you want to sum? ");
        int count = sc.nextInt();
        
        int sum = 0;
        System.out.println("Enter " + count + " numbers:");
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            sum += num;
        }
        
        System.out.println("Sum of " + count + " numbers is: " + sum);
        
        sc.close();
    }
}
/* 
 * SAMPLE OUTPUT:
 * How many numbers do you want to sum? 5
 * Enter 5 numbers:
 * Enter number 1: 10
 * Enter number 2: 20
 * Enter number 3: 30
 * Enter number 4: 40
 * Enter number 5: 50
 * Sum of 5 numbers is: 150
 */

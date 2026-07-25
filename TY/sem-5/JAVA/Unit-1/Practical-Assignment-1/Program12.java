// Program 12: Write a program to find out sum of 10 no. using any loop.

import java.util.Scanner;

class Program12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter 10 numbers:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            sum += num;
        }
        
        System.out.println("Sum of 10 numbers is: " + sum);
        
        sc.close();
    }
}
/* 
 * SAMPLE OUTPUT:
 * Enter 10 numbers:
 * Enter number 1: 5
 * Enter number 2: 10
 * Enter number 3: 15
 * Enter number 4: 20
 * Enter number 5: 25
 * Enter number 6: 30
 * Enter number 7: 35
 * Enter number 8: 40
 * Enter number 9: 45
 * Enter number 10: 50
 * Sum of 10 numbers is: 275
 */

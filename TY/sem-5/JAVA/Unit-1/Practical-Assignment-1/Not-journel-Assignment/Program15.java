// Program 15: Write a java program to print first N numbers.
// Dynamic version: User specifies how many numbers to print.

import java.util.Scanner;

class Program15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter how many numbers to print: ");
        int n = sc.nextInt();
        
        System.out.println("First " + n + " numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
/* 
 * SAMPLE OUTPUT:
 * Enter how many numbers to print: 10
 * First 10 numbers:
 * 1 2 3 4 5 6 7 8 9 10
 */

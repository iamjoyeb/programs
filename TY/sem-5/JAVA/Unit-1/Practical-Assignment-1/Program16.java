// Program 16: Write a program to print following series, 1, 3, 6, 11, 18, 29, ...

import java.util.Scanner;

class Program16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        int term = 1;
        int diff = 2;
        
        System.out.print("Series: " + term);
        for (int i = 2; i <= n; i++) {
            term += diff;
            System.out.print(", " + term);
            diff += 2;
        }
        System.out.println();
        
        sc.close();
    }
}
/* 
 * SAMPLE OUTPUT:
 * Enter the number of terms: 6
 * Series: 1, 3, 6, 11, 18, 29
 * 
 * (Differences: +2, +3, +5, +7, +11 which are successive prime numbers)
 */

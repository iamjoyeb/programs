// Program 16: Write a program to print following series, 1, 3, 6, 11, 18, 29, ...
// The differences between consecutive terms are successive prime numbers:
// +2, +3, +5, +7, +11, +13, ...

import java.util.Scanner;

class Program16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }
        
        int term = 1;
        int num = 2; // candidate for prime difference
        
        System.out.print("Series: " + term);
        for (int i = 2; i <= n; i++) {
            // Find the next prime number
            while (!isPrime(num)) {
                num++;
            }
            term += num;
            System.out.print(", " + term);
            num++; // move past the used prime
        }
        System.out.println();
        
        sc.close();
    }
    
    // Helper method to check if a number is prime
    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
/* 
 * SAMPLE OUTPUT:
 * Enter the number of terms: 6
 * Series: 1, 3, 6, 11, 18, 29
 * 
 * Explanation of differences: +2, +3, +5, +7, +11 (successive prime numbers)
 * 1 + 2 = 3
 * 3 + 3 = 6
 * 6 + 5 = 11
 * 11 + 7 = 18
 * 18 + 11 = 29
 * ...and so on
 */

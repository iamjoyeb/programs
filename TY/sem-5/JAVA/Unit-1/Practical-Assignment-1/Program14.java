// Program 14: Writ a program to print a Fibonacci series using for loop.

import java.util.Scanner;

class Program14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        int a = 0, b = 1;
        
        System.out.print("Fibonacci Series: " + a + ", " + b);
        
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
        
        System.out.println();
        sc.close();
    }
}

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

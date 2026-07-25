// Program 11: Write a java program to print reverse number enter by the user.

import java.util.Scanner;

class Program11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        System.out.println("Reversed number is: " + reversed);
        
        sc.close();
    }
}

// Program 9: Write a program to check whether the given no. is Armstrong or not.

import java.util.Scanner;

class Program9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
        
        sc.close();
    }
}
/* 
 * SAMPLE OUTPUT (Armstrong):
 * Enter a number: 153
 * 153 is an Armstrong number.
 * 
 * SAMPLE OUTPUT (Not Armstrong):
 * Enter a number: 123
 * 123 is not an Armstrong number.
 *
 * Note: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 */

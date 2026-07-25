// Program 1: Write a program to write your full name, address, college address on the screen.
// Dynamic version: Takes user input instead of hardcoded values.

import java.util.Scanner;

class Program1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        System.out.print("Enter your college address: ");
        String collegeAddress = sc.nextLine();

        System.out.println("\n--- Your Details ---");
        System.out.println("Full Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("College Address: " + collegeAddress);

        sc.close();
    }
}
/* 
 * SAMPLE OUTPUT:
 * Enter your full name: John Doe
 * Enter your address: 123, Main Street, Mumbai - 400001
 * Enter your college address: XYZ College, Andheri West, Mumbai - 400058
 *
 * --- Your Details ---
 * Full Name: John Doe
 * Address: 123, Main Street, Mumbai - 400001
 * College Address: XYZ College, Andheri West, Mumbai - 400058
 */

// Program 3: Write a java program to enter any string and display it on the screen.

import java.util.Scanner;

class Program3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any string: ");
        String str = sc.nextLine();
        
        System.out.println("You entered: " + str);
        
        sc.close();
    }
}

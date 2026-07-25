// Program 5: Create a class student with rno, sname and city as class member
// and get the detail from the user and display it on the screen.

import java.util.Scanner;

class Student {
    int rno;
    String sname;
    String city;
    
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rno = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Student Name: ");
        sname = sc.nextLine();
        System.out.print("Enter City: ");
        city = sc.nextLine();
        sc.close();
    }
    
    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll Number: " + rno);
        System.out.println("Student Name: " + sname);
        System.out.println("City: " + city);
    }
}

class Program5 {
    public static void main(String args[]) {
        Student s = new Student();
        s.getDetails();
        s.displayDetails();
    }
}
/* 
 * SAMPLE OUTPUT:
 * Enter Roll Number: 101
 * Enter Student Name: Alice
 * Enter City: Pune
 * 
 * --- Student Details ---
 * Roll Number: 101
 * Student Name: Alice
 * City: Pune
 */

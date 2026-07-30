// Program 6: Write a java program to read employee information such as no, name,
// basic salary, HRA, DA from the keyboard and display it on the screen.

import java.util.Scanner;

class Program6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee No: ");
        int empNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();
        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();
        System.out.print("Enter DA: ");
        double da = sc.nextDouble();
        
        System.out.println("\n--- Employee Information ---");
        System.out.println("Employee No: " + empNo);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Salary: " + (basicSalary + hra + da));
        
        sc.close();
    }
}
/* 
 * SAMPLE OUTPUT:
 * Enter Employee No: 101
 * Enter Employee Name: John Smith
 * Enter Basic Salary: 50000
 * Enter HRA: 15000
 * Enter DA: 10000
 * 
 * --- Employee Information ---
 * Employee No: 101
 * Employee Name: John Smith
 * Basic Salary: 50000.0
 * HRA: 15000.0
 * DA: 10000.0
 * Total Salary: 75000.0
 */

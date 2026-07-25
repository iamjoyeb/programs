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

// Q1. Write a Java program to create a Student class with name, roll number and percentage.
//     Accept student details and display them along with the result
//     (Fail, Pass Class, Second Class, First Class, Distinction) based on percentage.

import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    double percentage;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
        System.out.print("Enter percentage: ");
        percentage = sc.nextDouble();
        sc.close();
    }

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage < 35) {
            System.out.println("Result: Fail");
        } else if (percentage < 50) {
            System.out.println("Result: Pass Class");
        } else if (percentage < 60) {
            System.out.println("Result: Second Class");
        } else if (percentage < 70) {
            System.out.println("Result: First Class");
        } else {
            System.out.println("Result: Distinction");
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.getdata();
        s.display();
    }
}

/*
Output:
Enter student name: Rahul
Enter roll number: 101
Enter percentage: 75.5

--- Student Details ---
Name: Rahul
Roll No: 101
Percentage: 75.5%
Result: Distinction
*/
// Q7. Write a Java program to create an Employee class with empNo, name, age
//     and salary. Accept details for 3 employees and display them.

import java.util.Scanner;

class Employee {
    int no;
    String name;
    int age;
    double salary;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee number: ");
        no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
        sc.close();
    }

    void display() {
        System.out.println("No: " + no + " | Name: " + name + " | Age: " + age + " | Salary: " + salary);
    }
}

public class Program7 {
    public static void main(String[] args) {
        Employee[] emp = new Employee[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            emp[i] = new Employee();
            emp[i].getdata();
        }

        System.out.println("\n--- Employee Details ---");
        for (Employee e : emp) {
            e.display();
        }
    }
}

/*
Output:
Employee 1:
Enter employee number: 1
Enter name: Amit
Enter age: 28
Enter salary: 50000

Employee 2:
Enter employee number: 2
Enter name: Priya
Enter age: 25
Enter salary: 45000

Employee 3:
Enter employee number: 3
Enter name: Rahul
Enter age: 30
Enter salary: 60000

--- Employee Details ---
No: 1 | Name: Amit | Age: 28 | Salary: 50000.0
No: 2 | Name: Priya | Age: 25 | Salary: 45000.0
No: 3 | Name: Rahul | Age: 30 | Salary: 60000.0
*/
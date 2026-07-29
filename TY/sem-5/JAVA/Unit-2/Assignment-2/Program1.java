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

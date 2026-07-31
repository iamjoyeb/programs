/*Create a class student with rno, sname and city as class member and get the detail form the user and display it on the screen. */
import java.util.Scanner;
class Student {
    int rno;
    String sname;
    String city;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rno = sc.nextInt();

        System.out.print("Enter Student Name: ");
        sname = sc.next();

        System.out.print("Enter City: ");
        city = sc.next();

        sc.close();   // Fix Scanner resource leak
    }

    void displayData() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll Number : " + rno);
        System.out.println("Student Name: " + sname);
        System.out.println("City        : " + city);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.getData();
        s.displayData();
    }
}
/*
    OUTPUT:
    Enter Roll Number: 101
    Enter Student Name: Rahul
    Enter City: Ahmedabad

    --- Student Details ---
    Roll Number : 101
    Student Name: Rahul
    City        : Ahmedabad
*/
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

/* WRITE A JAVA CODE THAT CREATE CLASSES SUM,DIV,SUB, ALL THE CLASSES CONTAIN 
    SAME METHOD getvalue and discale APLLY DYNAMICDISPATCH METHOD MECHANISM */
    
import java.util.*;

class Arithmatic {
    Scanner sc = new Scanner(System.in);

    void getvalue() {
        System.out.println("Getting value for operations:");
    }

    void display() {
        System.out.println("Displaying all the Operations:");
    }
}

class sum extends Arithmatic {
    int a, b;

    void getvalue() {
        System.out.print("Enter two integer values to perform Addition: ");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    void display() {
        int sum = a + b;
        System.out.println("Sum of two integers is: " + sum);
    }
}

class sub extends Arithmatic {
    int a, b;

    void getvalue() {
        System.out.print("Enter two integer values to perform Subtraction: ");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    void display() {
        int sub = a - b;
        System.out.println("Subtraction of two integers is: " + sub);
    }
}

class div extends Arithmatic {
    int a, b;

    void getvalue() {
        System.out.print("Enter two integer values to perform Division: ");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    void display() {
        int div = a / b;
        System.out.println("Division of two integers is: " + div);
    }
}

class p9 {
    public static void main(String args[]) {

        // Dynamic Method Dispatch
        Arithmatic a = new sum();
        Arithmatic s = new sub();
        Arithmatic d = new div();

        a.getvalue();
        a.display();

        s.getvalue();
        s.display();

        d.getvalue();
        d.display();
    }
}
/*
    OUTPUT:
    Enter two integer values to perform Addition: 10 20
    Sum of two integers is: 30
    Enter two integer values to perform Subtraction: 20 5
    Subtraction of two integers is: 15
    Enter two integer values to perform Division: 90 3
    Division of two integers is: 30
*/
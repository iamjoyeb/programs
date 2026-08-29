/*Write a java program to perform the following classes.  Student Rno Name -> mark  m1,m2,m3 -> result percentage and total */

import java.util.*;

class Student{
    int rno;
    String name;

    Scanner sc=new Scanner(System.in);
    void sinput(){
        System.out.print("Enter Roll Number: ");
        rno=sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Name: ");
        name=sc.nextLine();
    }

    void sdisplay(){
        System.out.println("Student Roll Number is: "+ rno);
        System.out.println("Student Name is: "+ name);
    }
}

class mark extends Student{
    int m1,m2,m3;

    void minput(){
        System.out.print("Enter Mark 1: ");
        m1=sc.nextInt();
        System.out.print("Enter Mark 2: ");
        m2=sc.nextInt();
        System.out.print("Enter Mark 3: ");
        m3=sc.nextInt();
    }

    void mdisplay(){
        System.out.println("Student Mark 1 is: "+ m1);
        System.out.println("Student Mark 2 is: "+ m2);
        System.out.println("Student Mark 3 is: "+ m3);
    }
}

class result extends mark{
    int total;
    double per;

    void rdisplay(){
        total=m1+m2+m3;
        per=total/3;
        System.out.println("Total Mark is: "+total);
        System.out.println("Percentage is: "+per);
    }
}

class p6{
    public static void main(String args[]){
        result r=new result();
        r.sinput();
        r.minput();
        System.out.println("Student Details: ");
        r.sdisplay();
        r.mdisplay();
        r.rdisplay();
    }
}
/*
    OUTPUT:
    Enter Roll Number: 28
    Enter Name: joyeb
    Enter Mark 1: 80
    Enter Mark 2: 99
    Enter Mark 3: 98

    Student Details:
    
    Student Roll Number is: 28
    Student Name is: joyeb
    Student Mark 1 is: 80
    Student Mark 2 is: 99
    Student Mark 3 is: 98
    Total Mark is: 277
    Percentage is: 92.0
*/
/*Write a java program to perform the following classes.  Student Rno Name -> mark  m1,m2,m3 -> result percentage and total */

import java.util.*;

class Student{
    int rno;
    String name;

    Scanner sc=new Scanner(System.in);
    void sinput(){
        System.out.print("Enter Roll Number: ");
        rno=sc.nextInt();
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
    
}

class p6{
    public static void main(String args[]){

    }
}
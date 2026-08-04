/*Write a java program to enter the data of a book and display it using the multi-level
inheritance using following information. Class first(Book_no, book_name), Class
second(Author_name, Publisher), Class third(public first, public second) */

import java.util.*;

class book{
    int bno;
    String bname;
    void binput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Book Number: ");
        bno=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Name: ");
        bname=sc.nextLine();
    }

    void bdisplay(){
        System.out.println("Book Number is : "+bno);
        System.out.println("Book Name is : "+bname);
    }
}

class book1 extends book{
    String aname,pname;
    void b1input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Author Number: ");
        aname=sc.nextLine();
        System.out.print("Enter Publisher Name: ");
        pname=sc.nextLine();
    }

    void b1display(){
        System.out.println("Book Number is : "+aname);
        System.out.println("Book Name is : "+pname);
    }
}

class book2 extends book1{

}

class p3{
    public static void main(){
        book2 b=new book2();
        b.binput();
        b.b1input();
        System.out.println("----Book Details----");
        b.bdisplay();
        b.b1display();
    }
}
/*
    OUTPUT:
    Enter Book Number: 128
    Enter Book Name: JAVA
    Enter Author Number: john
    Enter Publisher Name: john
    ----Book Details----
    Book Number is : 128
    Book Name is : JAVA
    Book Number is : john
    Book Name is : john
*/
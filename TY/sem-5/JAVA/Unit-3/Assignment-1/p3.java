/*Write a java program to enter the data of a book and display it using the multi-level
inheritance using following information. Class first(Book_no, book_name), Class
second(Author_name, Publisher), Class third(public first, public second) */

import java.util.*;

class book{
    int bno;
    String bname;

    Scanner sc=new Scanner(System.in);

    void binput(){
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
	void b2(){
		System.out.println("All Operations Worked Sucssfully");
	}
}

class p3{
    public static void main(String args[]){
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
	
    Enter Book Number: 101
	Enter Book Name: java
	Enter Author Number: jk
	Enter Publisher Name: mn
	
		----Book Details----
		
	Book Number is : 101
	Book Name is : java
	Book Number is : jk
	Book Name is : mm
*/
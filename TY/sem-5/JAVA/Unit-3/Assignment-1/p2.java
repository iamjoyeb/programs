/* Write a java code that define class student with rno, name, mark1, mark2, mark3
and another class result with total and percentage and define a method to display
this value. */

import java.util.*;
class student{
	int rno;
	String name;
	double m1,m2,m3;
	
	Scanner sc=new Scanner(System.in);
	
	void sinput(){
		System.out.print("Enter Student Roll No: ");
		rno=sc.nextInt();

		sc.nextLine();
		System.out.print("Enter Student Name: ");
		name=sc.nextLine();
		System.out.print("Enter Student Mark 1: ");
		m1=sc.nextInt();
		System.out.print("Enter Student Mark 2: ");
		m2=sc.nextInt();
		System.out.print("Enter Student Mark 3: ");
		m3=sc.nextInt();
	}

	void sdisplay(){
		System.out.println("Student Roll No is: "+rno);
		System.out.println("Student Name is: "+name);
		System.out.println("Student Mark 1 is: "+m1);
		System.out.println("Student Mark 2 is: "+m2);
		System.out.println("Student Mark 3 is: "+m3);

	}
}

class result extends student{
		double total,per;

		void rdisplay(){
			total=m1+m2+m3;
			per=total/3;
			System.out.println("Total Mark  is: "+total);
			System.out.println("Total Percentage is: "+per+"%");
		}
		
}

class p2{
	public static void main(String args[]){
		result s=new result();
		s.sinput();
		System.out.println("Student Details:");
		s.sdisplay();
		s.rdisplay();
	}
}
/*
	OUTPUT:
	Enter Student Roll No: 28
	Enter Student Name: joyeb
	Enter Student Mark 1: 90
	Enter Student Mark 2: 99
	Enter Student Mark 3: 95
	Student Details:
	Student Roll No is: 28
	Student Name is: joyeb
	Student Mark 1 is: 90.0
	Student Mark 2 is: 99.0
	Student Mark 3 is: 95.0
	Total Mark  is: 284.0
	Total Percentage is: 94.66666666666667%
*/
/* Write a java program that read and display information that contains the following 
classes. Class emp(Emp_no, Emp_name, Salary), Class Dept(Dept_code, name). 
Use single inheritance.*/

import java.util.*;
class emp{
	int eno;
	String ename;
	double salary;
	Scanner sc=new Scanner(System.in);
	void einput(){
		
		System.out.print("Enter Employee NO: ");
		eno=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee Name: ");
		ename=sc.nextLine();
		System.out.print("Enter Employee Salary: ");
		salary=sc.nextDouble();
		//sc.close();
	}
	void edisplay(){
		System.out.println("Employee Number is: "+eno);
		System.out.println("Employee Name is: "+ename);
		System.out.println("Employee Salary is: "+salary);
	}
}

class dep extends emp{
	int dcode;
	String dname;
	
	void dinput(){
		System.out.print("Enter Department NO: ");
		dcode=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Department Name: ");
		dname=sc.nextLine();
		//sc.close();	
	}
	
	void ddisplay(){
		System.out.println("Department Code is: "+dcode);
		System.out.println("Department Name is: "+dname);
	}
}

class p1{
	public static void main(String args[]){
		dep d=new dep();
		d.einput();
		d.dinput();
		System.out.println("Employee Details: ");
		d.edisplay();
		System.out.println("Departement Details: ");
		d.ddisplay();
	}
}

/*
	OUTPUT:
	Enter Employee NO: 28
	Enter Employee Name: joyeb
	Enter Employee Salary: 10000
	Enter Department NO: 10
	Enter Department Name: BCA
		Employee Details:
			Employee Number is: 28
			Employee Name is: joyeb
			Employee Salary is: 10000.0
		Departement Details:
			Department Code is: 10
			Department Name is: BCA
*/
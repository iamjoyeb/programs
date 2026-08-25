/*Write a program in java that use hierarchical inheritance and use method for get and 
display detail as per given class information. First Class SVGC With details:
 Student id  and Student Name create 3 class as: BCA,MSW,BHMS;
 With the data memebers year semester and division*/

 import java.util.*;

class SVGC{
    int Sid;
	String name;

	Scanner sc=new Scanner(System.in);

		void sinput(){
			System.out.print("Enter Student ID: ");
			Sid=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Student Name: ");
			name=sc.nextLine();
		}
		
		void sdisplay(){
			System.out.println("Student ID: "+Sid);
			System.out.println("Student Name: "+name);
		}
}

class BCA extends SVGC{
    int sem;
	int year;
	String div;
	
	void input(){
		System.out.print("Enter Student Semester: ");
		sem=sc.nextInt();
		
		System.out.print("Enter Student Year: ");
		year=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Student Division: ");
		div=sc.nextLine();
	}
	
	void display(){
		System.out.println("Student Semester: "+sem);
		System.out.println("Student Year: "+year);
		System.out.println("Student Division: "+div);
	}
}

class MSW extends SVGC{
    int sem;
	int year;
	String div;
	
	void input(){
		System.out.print("Enter Student Semester: ");
		sem=sc.nextInt();
		
		System.out.print("Enter Student Year: ");
		year=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Student Division: ");
		div=sc.nextLine();
	}
	
	void display(){
		System.out.println("Student Semester: "+sem);
		System.out.println("Student Year: "+year);
		System.out.println("Student Division: "+div);
	}
}

class BHMS extends SVGC{
    int sem;
	int year;
	String div;
	
	void input(){
		System.out.print("Enter Student Semester: ");
		sem=sc.nextInt();
		
		System.out.print("Enter Student Year: ");
		year=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Student Division: ");
		div=sc.nextLine();
	}
	
	void display(){
		System.out.println("Student Semester: "+sem);
		System.out.println("Student Year: "+year);
		System.out.println("Student Division: "+div);
	}
}

class p5{
    public static void main(String[] args){
       BCA bca=new BCA();
       MSW msw=new MSW();
       BHMS bhms=new BHMS();
	   
	   System.out.println("Student Details As Per Departements:");
	   
	   System.out.println(" Enter BCA Student Details :");
	   bca.sinput();
	   bca.input();
	   
	   System.out.println("Enter MSW Student Details :");
	   
	   msw.sinput();
	   msw.input();
	   
	   System.out.println("Enter BHMS Student Details :");
	   
	   bhms.sinput();
	   bhms.input();
	   
	   System.out.println("--- BCA Student Details :");
	   
	   bca.sdisplay();
	   bca.display();
	   
	   System.out.println("---MSW Student Details :");
	   
	   msw.sdisplay();
	   msw.display();
	   
	   System.out.println("---BHMS Student Details :");
	   
	   bhms.sdisplay();
	   bhms.display();
    }
}
/*
	OUTPUT:
	Student Details As Per Departements:
	
	Enter BCA Student Details :
	
	Enter Student ID: 28
	Enter Student Name: joyeb
	Enter Student Semester: 5
	Enter Student Year: 2026
	Enter Student Division: class C
	
	Enter MSW Student Details :
	
	Enter Student ID: 41
	Enter Student Name: tushal
	Enter Student Semester: 5
	Enter Student Year: 2026
	Enter Student Division: Class C
	
	Enter BHMS Student Details :
	
	Enter Student ID: 32
	Enter Student Name: Mehul
	Enter Student Semester: 5
	Enter Student Year: 2026
	Enter Student Division: Class C
	
	--- BCA Student Details :
	
	Student ID: 28
	Student Name: joyeb
	Student Semester: 5
	Student Year: 2026
	Student Division: class C
	
	---MSW Student Details :
	
	Student ID: 41
	Student Name: tushal
	Student Semester: 5
	Student Year: 2026
	Student Division: Class C
	
	---BHMS Student Details :
	
	Student ID: 32
	Student Name: Mehul
	Student Semester: 5
	Student Year: 2026
	Student Division: Class C
*/
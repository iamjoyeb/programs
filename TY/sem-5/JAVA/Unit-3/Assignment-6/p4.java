/*Write a java program to define a class name student _details student _details includes st_id st_name st_phone st_course data members use the constructor overloadingand display all information about student */

class student_details{
	int st_id;
	String st_name;
	long st_phone;
	String st_course;

	student_details(){
		st_id=0;
		st_name="";
		st_phone=0;
		st_course="";
	}

	student_details(int st_id,String st_name){
		this.st_id=st_id;
		this.st_name=st_name;
		this.st_phone=0;
		this.st_course="";
	}

	student_details(int st_id,String st_name,long st_phone,String st_course){
		this.st_id=st_id;
		this.st_name=st_name;
		this.st_phone=st_phone;
		this.st_course=st_course;
	}

	void display(){
		System.out.println("Student ID: "+st_id);
		System.out.println("Student Name: "+st_name);
		System.out.println("Student Phone: "+st_phone);
		System.out.println("Student Course: "+st_course);
	}
}

class p4{
	public static void main(String args[]){
		student_details s1=new student_details();
		System.out.println("--- Constructor 1 (No args) ---");
		s1.display();

		student_details s2=new student_details(101,"Amit");
		System.out.println("\n--- Constructor 2 (ID, Name) ---");
		s2.display();

		student_details s3=new student_details(102,"Sneha",9876543210L,"BCA");
		System.out.println("\n--- Constructor 3 (All args) ---");
		s3.display();
	}
}

/*
	OUTPUT:
	--- Constructor 1 (No args) ---
	Student ID: 0
	Student Name: 
	Student Phone: 0
	Student Course: 

	--- Constructor 2 (ID, Name) ---
	Student ID: 101
	Student Name: Amit
	Student Phone: 0
	Student Course: 

	--- Constructor 3 (All args) ---
	Student ID: 102
	Student Name: Sneha
	Student Phone: 9876543210
	Student Course: BCA
*/

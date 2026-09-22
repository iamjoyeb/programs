/* Define a class Student With Name Rollno mark1 mark2 total and percentage variables define a constructor to initialize variables and a method to calculate total as well as percentage define sepreate method displaydata() to print all the information */

class Student{
	String name;
	int rollno;
	double mark1,mark2,total,percentage;

	Student(String name,int rollno,double mark1,double mark2){
		this.name=name;
		this.rollno=rollno;
		this.mark1=mark1;
		this.mark2=mark2;
	}

	void calculate(){
		total=mark1+mark2;
		percentage=total/2;
	}

	void displaydata(){
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollno);
		System.out.println("Mark1: "+mark1);
		System.out.println("Mark2: "+mark2);
		System.out.println("Total: "+total);
		System.out.println("Percentage: "+percentage);
	}
}

class p3{
	public static void main(String args[]){
		Student s=new Student("Priya",102,85.5,90.0);
		s.calculate();
		s.displaydata();
	}
}

/*
	OUTPUT:
	Name: Priya
	Roll No: 102
	Mark1: 85.5
	Mark2: 90.0
	Total: 175.5
	Percentage: 87.75
*/

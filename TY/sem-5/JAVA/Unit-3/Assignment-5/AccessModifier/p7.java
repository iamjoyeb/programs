/* write a java program to demonstrate Acess Modifers */

class Student{
	public String name;
	protected int rollNo;
	String college;
	private double marks;

	public Student(String name,int rollNo,String college,double marks){
		this.name=name;
		this.rollNo=rollNo;
		this.college=college;
		this.marks=marks;
	}

	public void showPublic(){
		System.out.println("Public: name="+name);
	}

	protected void showProtected(){
		System.out.println("Protected: rollNo="+rollNo);
	}

	void showDefault(){
		System.out.println("Default: college="+college);
	}

	private void showPrivate(){
		System.out.println("Private: marks="+marks);
	}

	public void showAll(){
		showPublic();
		showProtected();
		showDefault();
		showPrivate();
	}
}

class p7{
	public static void main(String args[]){
		Student s=new Student("Rahul",101,"MIT",89.5);

		System.out.println("--- Accessing within same class ---");
		s.showAll();

		System.out.println("\n--- Access modifiers demo ---");
		System.out.println("public name: "+s.name);
		System.out.println("protected rollNo: "+s.rollNo);
		System.out.println("default college: "+s.college);
		System.out.println("private marks: cannot access directly");
	}
}

/*
	OUTPUT:
	--- Accessing within same class ---
	Public: name=Rahul
	Protected: rollNo=101
	Default: college=MIT
	Private: marks=89.5

	--- Access modifiers demo ---
	public name: Rahul
	protected rollNo: 101
	default college: MIT
	private marks: cannot access directly
*/

/*Write a java program of constructor overloading which is used parameterized constructor use id,name,city as a data member*/

class Person{
	int id;
	String name;
	String city;

	Person(){
		id=0;
		name="";
		city="";
	}

	Person(int id,String name,String city){
		this.id=id;
		this.name=name;
		this.city=city;
	}

	void display(){
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("City: "+city);
	}
}

class p1{
	public static void main(String args[]){
		Person p1=new Person();
		System.out.println("--- Default Constructor ---");
		p1.display();

		Person p2=new Person(101,"Rahul","Mumbai");
		System.out.println("\n--- Parameterized Constructor ---");
		p2.display();
	}
}

/*
	OUTPUT:
	--- Default Constructor ---
	ID: 0
	Name: 
	City: 

	--- Parameterized Constructor ---
	ID: 101
	Name: Rahul
	City: Mumbai
*/

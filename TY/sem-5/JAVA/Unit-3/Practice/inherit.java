class A {
	void display(){
		System.out.println("From Class A");
	}
}

//class B extends  A{ used for multilevel Inheritance
class B extends  A{
	void d(){
		System.out.println("From Class B");
	}
}

//class C extends  B{  used for multilevel Inheritance
class C extends  A{
	void d1(){
		System.out.println("From Class C");
	}
}

class inherit{
	public static void main(String args[]){
		B b=new B();
		C c=new C();
		System.out.println("Method From B CLass");
		b.display();
		b.d();
		
		System.out.println("Method From C CLass");
		c.display();
		c.d1();
		
	/*	c.display();
		c.d();
		c.d1();
		
		used for multilevel Inheritance		
	*/
	}
}
/*
	OUTPUT:- MULTILEVEL INHERITANCE
		From Class A
		From Class B
		From Class C
	OUTPUT:- HIEARCHICAL INHERITANCE
		Method From B CLass
		From Class A
		From Class B
		Method From C CLass
		From Class A
		From Class C
*/
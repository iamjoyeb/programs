/* Define an interface addsub with two method void  addition(int,int) Substraction(int,int) and 
another interface muldiv with two methods  void multiply(int,int) and void division(int,int) extends 
first inerface and implements the interface into suitable class */

interface addsub{
	void addition(int a,int b);
	void Substraction(int c,int d);
}

interface muldiv extends addsub{
	void multiply(int e,int f);
	void division(int g,int h);
}

class Arithmatic implements muldiv{

	public void addition(int a, int b){
		int sum=a+b;
		System.out.println("Addition is: "+sum);
	}

	public void Substraction(int c, int d){
		int sum=c-d;
		System.out.println("Substraction is: "+sum);
	}

	public void multiply(int e, int f){
		int sum=e*f;
		System.out.println("Multiplication is: "+sum);
	}

	public void division(int g, int h){
		int sum=g/h;
		System.out.println("Division is: "+sum);
	}
}

class p1{
	public static void main(String args[]){
		Arithmatic a=new Arithmatic();
		a.addition(10,20);
		a.Substraction(20,5);
		a.multiply(10,20);
		a.division(25,20);
	}
}

/*
	OUTPUT:
	Addition is: 30
	Substraction is: 15
	Multiplication is: 200
	Division is: 1
*/

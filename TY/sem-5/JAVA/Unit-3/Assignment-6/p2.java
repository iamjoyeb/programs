/*Write a java program to perform swap two value using class object  method (use getdata() and swap() ) */

class Swap{
	int a,b;

	void getdata(int a,int b){
		this.a=a;
		this.b=b;
	}

	void swap(){
		int temp=a;
		a=b;
		b=temp;
	}

	void display(){
		System.out.println("After swap: a="+a+", b="+b);
	}
}

class p2{
	public static void main(String args[]){
		Swap s=new Swap();
		s.getdata(10,20);
		System.out.println("Before swap: a=10, b=20");
		s.swap();
		s.display();
	}
}

/*
	OUTPUT:
	Before swap: a=10, b=20
	After swap: a=20, b=10
*/

/*Write a java code that defines class rectangle the class define two methods for calculating area and perimeter define constructor to initalize the variable use the following formulla for calculation 
area of rectangle = x*y
permiter of rectangle = 2*(x+y) */

class Rectangle{
	double x,y;

	Rectangle(double x,double y){
		this.x=x;
		this.y=y;
	}

	double area(){
		return x*y;
	}

	double perimeter(){
		return 2*(x+y);
	}

	void display(){
		System.out.println("Length: "+x);
		System.out.println("Breadth: "+y);
		System.out.println("Area: "+area());
		System.out.println("Perimeter: "+perimeter());
	}
}

class p7{
	public static void main(String args[]){
		Rectangle r=new Rectangle(10,20);
		r.display();
	}
}

/*
	OUTPUT:
	Length: 10.0
	Breadth: 20.0
	Area: 200.0
	Perimeter: 60.0
*/

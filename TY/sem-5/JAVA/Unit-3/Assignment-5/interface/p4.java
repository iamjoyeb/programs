/* write a java program to demonstrate code for demonstarate the use of Hybrid inheritance using interface */

interface Shape{
	void draw();
}

interface Color{
	void fill();
}

class Circle implements Shape{
	public void draw(){
		System.out.println("Drawing Circle");
	}
}

class ColoredCircle extends Circle implements Color{
	public void fill(){
		System.out.println("Filling Circle with Red Color");
	}
}

class p4{
	public static void main(String args[]){
		ColoredCircle cc=new ColoredCircle();
		cc.draw();
		cc.fill();
	}
}

/*
	OUTPUT:
	Drawing Circle
	Filling Circle with Red Color
*/

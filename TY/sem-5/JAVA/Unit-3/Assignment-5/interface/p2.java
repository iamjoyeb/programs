/* create an interface interarea containing two methods that float area(float,float) float perimeter(float,float)
 create two diffrent class rectangle and circle implements above two methos in class in main two object create 
 triangle and circle using above new operator for assign them into suitable class  */
 
interface interarea{
	void area(float l,float h);
}

interface interarea1{
	void perimeter(float pi,float r);
}


class rectangle implements interarea{
	public void area(float l,float h){
		System.out.println("Total Area Of Rectangle is: "+(l*h));
	}
}

class circle implements interarea1{
	public void perimeter(float pi,float r){
		System.out.println("Total Parameter Of Circle is: "+(pi*r*r));
	}
}

class p2{
	public static void main(String args[]){
		rectangle r=new rectangle();
		circle c=new circle();
		r.area(10f,20f);
		c.perimeter(3.14f,8f);
	}
}
/*
	OUTPUT:
	Total Area Of Rectangle is: 200.0
	Total Parameter Of Circle is: 200.96
*/
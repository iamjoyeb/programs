/* create an interface interarea containing two methods that float area(float,float) float perimeter(float,float)
 create two diffrent class rectangle and circle implements above two methos in class in main two object create 
 triangle and circle using above new operator for assign them into suitable class  */

interface interarea{
	float area(float a,float b);
	float perimeter(float a,float b);
}

class triangle implements interarea{
	public float area(float base,float height){
		float a=0.5f*base*height;
		System.out.println("Total Area Of Triangle is: "+a);
		return a;
	}

	public float perimeter(float a,float b){
		float p=a+b+(float)Math.sqrt(a*a+b*b);
		System.out.println("Total Perimeter Of Triangle is: "+p);
		return p;
	}
}

class circle implements interarea{
	public float area(float pi,float r){
		float a=pi*r*r;
		System.out.println("Total Area Of Circle is: "+a);
		return a;
	}

	public float perimeter(float pi,float r){
		float p=2*pi*r;
		System.out.println("Total Perimeter Of Circle is: "+p);
		return p;
	}
}

class p2{
	public static void main(String args[]){
		triangle t=new triangle();
		circle c=new circle();
		t.area(10f,20f);
		t.perimeter(10f,20f);
		c.area(3.14f,8f);
		c.perimeter(3.14f,8f);
	}
}

/*
	OUTPUT:
	Total Area Of Triangle is: 100.0
	Total Perimeter Of Triangle is: 58.28427
	Total Area Of Circle is: 200.96
	Total Perimeter Of Circle is: 50.24
*/

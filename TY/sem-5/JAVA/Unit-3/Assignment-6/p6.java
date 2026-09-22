/*Write a java program to display sim using method overloading */

class SIM{
	void display(){
		System.out.println("No argument SIM");
	}

	void display(String brand){
		System.out.println("SIM Brand: "+brand);
	}

	void display(String brand,String network){
		System.out.println("SIM Brand: "+brand);
		System.out.println("Network: "+network);
	}

	void display(String brand,String network,double price){
		System.out.println("SIM Brand: "+brand);
		System.out.println("Network: "+network);
		System.out.println("Price: "+price);
	}
}

class p6{
	public static void main(String args[]){
		SIM s=new SIM();
		s.display();
		System.out.println("---");
		s.display("Jio");
		System.out.println("---");
		s.display("Airtel","4G");
		System.out.println("---");
		s.display("Vi","5G",299.0);
	}
}

/*
	OUTPUT:
	No argument SIM
	---
	SIM Brand: Jio
	---
	SIM Brand: Airtel
	Network: 4G
	---
	SIM Brand: Vi
	Network: 5G
	Price: 299.0
*/

/*Write a java program that defines a class interest this class includes methods for the calculating simple inteset for data member intialization use appropritate constructor */

class Interest{
	double principal;
	double rate;
	double time;

	Interest(double principal,double rate,double time){
		this.principal=principal;
		this.rate=rate;
		this.time=time;
	}

	double calculateSI(){
		return (principal*rate*time)/100;
	}

	void display(){
		System.out.println("Principal: "+principal);
		System.out.println("Rate: "+rate);
		System.out.println("Time: "+time);
		System.out.println("Simple Interest: "+calculateSI());
	}
}

class p5{
	public static void main(String args[]){
		Interest i=new Interest(5000,8,2);
		i.display();
	}
}

/*
	OUTPUT:
	Principal: 5000.0
	Rate: 8.0
	Time: 2.0
	Simple Interest: 800.0
*/

/* write a package code arithmatic that contains method to 
deal all arithmatic operations also write a program to use the package */

import arithmetic.Arithmatic;

class p6{
	public static void main(String args[]){
		Arithmatic a=new Arithmatic();
		System.out.println("Addition: "+a.add(10,20));
		System.out.println("Substraction: "+a.sub(20,5));
		System.out.println("Multiplication: "+a.mul(10,20));
		System.out.println("Division: "+a.div(25,5));
	}
}

/*
	OUTPUT:
	Addition: 30
	Substraction: 15
	Multiplication: 200
	Division: 5
*/

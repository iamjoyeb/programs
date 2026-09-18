/* create a package TYBCA which will have 2 classes as class mathematics write a method to add 2 numbers and 3 float numbers
and class. maximum with a method to find the maximum of 2 nos */

import TYBCA.mathematics;
import TYBCA.maximum;

class p8{
	public static void main(String args[]){
		mathematics m=new mathematics();
		System.out.println("Add 2 numbers: "+m.add(10,20));
		System.out.println("Add 3 floats: "+m.add(10.5f,20.3f,30.2f));

		maximum mx=new maximum();
		System.out.println("Maximum of 25 and 40: "+mx.max(25,40));
	}
}

/*
	OUTPUT:
	Add 2 numbers: 30
	Add 3 floats: 61.0
	Maximum of 25 and 40: 40
*/

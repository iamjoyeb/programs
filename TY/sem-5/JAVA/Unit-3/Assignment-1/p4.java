/*Write a java code to enter data of various cars and display it using multi-level 
inheritance. Class first (car_name, model) Class second(car_no, year) Class 
third(getdata(), putdata()) */

import java.util.*;

class car1{
    String cname;
	String cmodel;  
	
	Scanner sc=new Scanner(System.in);
}

class car2 extends car1{
    int carno;
	int year;
}

class car3 extends car2{
	void getdata(){
        System.out.print("Enter Car Model: ");
        cmodel=sc.nextLine();
        System.out.print("Enter Car Name: ");
        cname=sc.nextLine();
		
		System.out.print("Enter Car Number: ");
        carno=sc.nextInt();
        System.out.print("Enter Year: ");
        year=sc.nextInt();
	}
	
	void putdata(){
		System.out.println("Car Model is : "+cmodel);
        System.out.println("Car Name is : "+cname);
		
		System.out.println("Car Number is : "+carno);
        System.out.println("Year is : "+year);
	}
}

class p4{
    public static void main(String args[]){
       car3 car=new car3();
	   car.getdata();
	   System.out.println("Car Details:");
	   car.putdata();
    }
}
/*
	OUTPUT:
		Enter Car Model: A-1
		Enter Car Name: BMW
		Enter Car Number: 0001
		Enter Year: 2026
		
			Car Details:
			
		Car Model is : A-1
		Car Name is : BMW
		Car Number is : 1
		Year is : 2026
*/
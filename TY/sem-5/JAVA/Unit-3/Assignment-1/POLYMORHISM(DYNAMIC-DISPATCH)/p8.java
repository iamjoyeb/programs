/* WRITE A JAVA PROGRAM THAT CREATE THREE CLASSES CRICKET,FOOTBALL,BASKETBALL
	ALL THIS CLASS HAS SAME METHOD getpoint() and dispoint() METHODS 
	NOW DISPLAYING DATA USING POLYMORPHISM MECHANISM (DYNAMIC METHOD DISPATCH) */

import java.util.*;

class cricket{
	int cp;
	
	Scanner sc=new Scanner(System.in);
	
	void getpoint(){
		System.out.print("Enter Cricket Points: ");
		cp=sc.nextInt();
	}
	
	void dispoint(){
		System.out.print("Cricket Points is: "+cp);
	}
}

class football extends cricket{
	
	int fp;
	
	void getpoint(){
		System.out.print("Enter Football Points: ");
		fp=sc.nextInt();
	}
	
	void dispoint(){
		System.out.print("Football Points is: "+fp);
	}
}

class basketball extends football{
	
	int bp;
	
	void getpoint(){
		System.out.print("Enter Basketball Points: ");
		bp=sc.nextInt();
	}
	
	void dispoint(){
		System.out.print("Basketball Points is: "+bp);
	}
}
	
class p8{
	public static void main(String args[]){
		cricket b=new basketball();
		b.getpoint();
		b.dispoint();
	}
}
/*
	OUTPUT:
		Enter Basketball Points: 10
		Basketball Points is: 10
*/
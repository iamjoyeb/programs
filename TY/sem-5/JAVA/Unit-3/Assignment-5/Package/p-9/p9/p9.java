/* create a java package games, which have 2 classes indore and outdore
 use a function display() to generate the list of players for this specific games  */
package p9;
import out.*;
import games.*;

class p9{
	public static void main(String args[]){
		indoor i=new indoor();
		outdoor o=new outdoor();
		
		i.display();
		o.display();		
	}
}
/*
	OUTPUT:
	Chess,carom,cards
	cricket,football,basketball,vollyball
*/
/*Define the class for vehicle with color and name of company
as data members. Define two other classes for car and bike, which
inherits the data members of the class vehicle and has a member
for the price. Get the details from the user and display it. */

import java.util.*;

class vehical{
    String name,color;

    Scanner sc=new Scanner(System.in);
    void vinput(){
        System.out.print("Enter Vehical Color: ");
        color=sc.nextLine();

        System.out.print("Enter Vehical Company Name: ");
        name=sc.nextLine();
    }

    void vdisplay(){
        System.out.println("Vehical Color Is: "+color);
        System.out.println("Vehical Company Name Is: "+name);
    }
}

class car extends vehical{
    int price;

    void input(){
        System.out.print("Enter Vehical Price: ");
        price=sc.nextInt();
    }

    void display(){
        System.out.println("Vehical Price Is: "+price);
    }
}

class bike extends vehical{
    int price;

    void input(){
        System.out.print("Enter Vehical Price: ");
        price=sc.nextInt();
    }

    void display(){
        System.out.println("Vehical Price Is: "+price);
    }
}

class p9{
    public static void main(String args[]){
        car c=new car();
        bike b=new bike();

        System.out.println("Enter Details of Car: ");
        c.vinput();
        c.input();

        System.out.println("Enter Details of Bike: ");
        b.vinput();
        b.input();

        System.out.println("Details of Car: ");
        c.vdisplay();
        c.display();

        System.out.println("Details of Bike: ");
        b.vdisplay();
        b.display();
    }
}
/*
    OUTPUT:

    Enter Details of Car: 

    Enter Vehical Color: blue
    Enter Vehical Company Name: KIA
    Enter Vehical Price: 2000000

    Enter Details of Bike: 

    Enter Vehical Color: Black
    Enter Vehical Company Name: HONDA
    Enter Vehical Price: 80000

    Details of Car: 

    Vehical Color Is: blue
    Vehical Company Name Is: KIA
    Vehical Price Is: 2000000

    Details of Bike: 
    
    Vehical Color Is: Black
    Vehical Company Name Is: HONDA
    Vehical Price Is: 80000
*/
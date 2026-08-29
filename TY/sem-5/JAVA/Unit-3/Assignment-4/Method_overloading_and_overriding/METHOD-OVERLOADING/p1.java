/*WRITE A JAVA PROGRAM TO DISPLAY SUM USING METHOD OVERLOADING */
import java.util.*;

class add{
    void calculate(int A , int B){
        System.out.println("Substraction is:"+(A-B));
    }
	
	void calculate(double A , int B){
        System.out.println("Addition is:"+(A+B));
    }
}

class p1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int A=sc.nextInt();
        System.out.print("Enter Number 2: ");
        int B=sc.nextInt();

        add s=new add();
        s.calculate(A,B);
        s.calculate((double)A,B);
        sc.close();
    }
}
/*
    OUTPUT:
    Enter Number 1: 10
    Enter Number 2: 20
    Substraction is:-10
    Addition is:30.0
*/
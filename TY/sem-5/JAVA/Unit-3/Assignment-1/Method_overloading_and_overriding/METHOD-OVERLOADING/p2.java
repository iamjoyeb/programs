/* DEFINE A SERIES WITH THE OVERLOADED METHOD TO PRINT FIBONACCI SERIES THIS CLASS MUST CONTAIN FOLLOWING METHODS 
        1. void fibonacci()
        2. void fibonacci(int terms) */
		
import java.util.*;

class series{
        int terms;
        int a=0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        void fibonacci(){
              
                System.out.print("Enter Int Value To run Fibonacci Series: ");
                terms=sc.nextInt();

                fibonacci(terms);
        }

        void fibonacci(int terms){
              System.out.println("------ FIBONACCI SERIES ------");
                
              for(int i=1; i<=terms; i++){
                System.out.println(a +" ");

                int c=a+b;
                a=b;
                b=c;
              }
        }
}

class p2{
	public static void main(String args[]){
                series f=new series();

                f.fibonacci();
	}
}

/*
OUTPUT:
        Enter Int Value To run Fibonacci Series: 10
                ------ FIBONACCI SERIES ------
                        0 
                        1 
                        1 
                        2 
                        3 
                        5 
                        8 
                        13 
                        21 
                        34 
*/
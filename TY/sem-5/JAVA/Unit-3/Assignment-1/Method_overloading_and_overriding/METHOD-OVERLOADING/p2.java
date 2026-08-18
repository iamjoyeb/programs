/* DEFINE A SERIES WITH THE OVERLOADED METHOD TO PRINT FIBONACCI SERIES THIS CLASS MUST CONTAIN FOLLOWING METHODS 
        1. void fibonacci()
        2. void fibonacci(int terms) */
		
import java.util.*;

class fibonacci{
	int n;
	
	Scanner sc=new Scanner(System.in);
	
	void fibo(){
		System.out.print("Enter An int Number To perform the Fibonacci Series: ");
		n=sc.nextInt();
	}
	
	void fibo() {
		super.fibo();
		
		System.out.println(" ------ FIBONACCI Series: ------");
		
		for(int i=0;i<=n;i++){
			System.out.println(i);
		}
	}
}

class p2{
	public Static void main(String args[]){
		fibo f=new fibo();
		f.fibo();
	}
}
import java.util.Scanner;

class add{
    void calculate(int A , int B){
        System.out.println("Addition is:"+(A+B));
    }
}

class sub extends add{
    @Override
    void calculate(int A , int B){
        super.calculate(A,B);
         System.out.println("Substraction is:"+(A-B));
    }
}

class p2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int A=sc.nextInt();
        System.out.print("Enter Number 2: ");
        int B=sc.nextInt();

        sub s=new sub();
        s.calculate(A,B);
        sc.close();
    }
}
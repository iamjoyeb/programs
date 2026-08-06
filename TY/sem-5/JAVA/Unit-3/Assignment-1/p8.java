/*Write a program to illustrate the hierarchical inheritance in
creating two new classes called saving account and current from
the base class account. */
import java.util.*;

class Account{
    String hname;
    int acc_no;
    String acc_type;

    Scanner sc=new Scanner(System.in);
    void getdata(){
        System.out.print("Enter Account Holder Name: ");
        hname=sc.nextLine();

        System.out.print("Enter Account Number: ");
        acc_no=sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Account Type: ");
        acc_type=sc.nextLine();
    }

    void display(){

        System.out.println("Account Holder Name is: "+hname);

        System.out.println("Account Number is: "+acc_no);

        System.out.println("Account type is: "+acc_type);
    }
}

class Current_Account extends Account{
    double balance,minimum;

    void cgetdata(){
        
        System.out.print("Enter Account Balance: ");
        balance=sc.nextDouble();

        System.out.print("Enter Minimum Account Balance: ");
        minimum=sc.nextDouble();
    }

    void cdisplay(){
        System.out.println("Account Balance is : "+balance);

        System.out.println("Minimum Account Balance is : "+minimum);
    }
}

class saving_Account extends Account{
    double balance,minimum;

    void sgetdata(){
        System.out.print("Enter Account Balance: ");
        balance=sc.nextDouble();

        System.out.print("Enter Minimum Account Balance: ");
        minimum=sc.nextDouble();
    }

    void sdisplay(){
        System.out.println("Account Balance is : "+balance);

        System.out.println("Minimum Account Balance is : "+minimum);
    }
}

public class p8 {
    public static void main(String args[]){
        
        Current_Account c=new Current_Account();

        saving_Account s=new saving_Account();

        System.out.println("Enter Details For the Saving And Current Account");

        System.out.println("Enter Details For Current Account");

        c.getdata();
        c.cgetdata();

        System.out.println("Enter Details For Saving Account");
        s.getdata();
        s.sgetdata();

        System.out.println("Details of the Saving And Current Account");

        System.out.println("Details For Current Account");

        c.display();
        c.cdisplay();
        

        System.out.println("Details For Saving Account");
        s.display();
        s.sdisplay();
    }
}
/*
    OUTPUT:
    Enter Details For the Saving And Current Account

    Enter Details For Current Account

    Enter Account Holder Name: joyeb
    Enter Account Number: 101
    Enter Account Type: Current
    Enter Account Balance: 50000
    Enter Minimum Account Balance: 10000

    Enter Details For Saving Account

    Enter Account Holder Name: joyeb
    Enter Account Number: 101
    Enter Account Type: saving
    Enter Account Balance: 40000
    Enter Minimum Account Balance: 5000

    Details of the Saving And Current Account

    Details For Current Account

    Account Holder Name is: joyeb
    Account Number is: 101
    Account type is: Current
    Account Balance is : 50000.0
    Minimum Account Balance is : 10000.0

    Details For Saving Account
    
    Account Holder Name is: joyeb
    Account Number is: 101
    Account type is: saving
    Account Balance is : 40000.0
    Minimum Account Balance is : 5000.0
*/
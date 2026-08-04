class A{
    void display(){
        System.out.println("Call From Class A ");
    }
}

class B extends A{
    void display(){
        super.display();
        System.out.println("Call From Class B ");
    }
}
class p1 {
    public static void main(String args[]){
        B b=new B();
        b.display();
    }
}
/*
    OUTPUT:
    Call From Class A 
    Call From Class B 
*/
/* WRITE A JAVA PROGRAM TO DEMONSTARTE THE USE OF ABSTRACT CLASS */

abstract class abstractdemo{
    abstract void ad();

    void display(){
        System.out.println("Abstract Class Demo: ");
    }
}

class abstractdemo1 extends abstractdemo{
    void ad(){
        System.out.println("Abstract Class Demo: Call From Abstractdemo 1 class : ");
    }
}
class p5{
    public static void main(String args[]){
        abstractdemo1 a=new abstractdemo1();
        a.display();
        a.ad();
    }
}

/*
    OUTPUT:
    Abstract Class Demo: 
    Abstract Class Demo: Call From Abstractdemo 1 class : 
*/
/*WRITE A JAVA PROGRAM TO DEMONSTRATE THE  SUPER KEYWORD */

class overidesuper{
    void orrs(){
        System.out.println("Call From Overidingsuper class method using the super keyword");
    }
}

class overrides extends overidesuper{
    void orrs(){
        super.orrs();
        System.out.println("Call From Overidings class method");
    }
}
class p4{
    public static void main(String args[]){
        overrides orrs=new overrides();

        orrs.orrs();
    }
}
/*
    OUTPUT:
    Call From Overidingsuper class method using the super keyword
    Call From Overidings class method
*/
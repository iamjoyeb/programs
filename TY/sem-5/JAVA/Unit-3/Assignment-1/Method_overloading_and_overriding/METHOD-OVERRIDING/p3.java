/* WRITE A JAVA PROGRAM TO DEMONSTARTIC THE USE OF THE METHOD OVERRIDING IN PROGRA, */

class override{
    void orr(){
        System.out.println("Call From Override class orr method");
    }
}

class overridesecond extends override{
    void orr(){
        System.out.println("Call From overridesecond class orr method");
    }
}

class p3{
    public static void main(String args[]){
        overridesecond o=new overridesecond();

        o.orr();
    }
}
/*
    OUTPUT:
    Call From overridesecond class orr method
*/
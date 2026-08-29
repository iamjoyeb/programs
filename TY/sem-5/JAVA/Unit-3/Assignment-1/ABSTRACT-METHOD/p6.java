/* WRITE A JAVA PROGRAM TO CALCULATE THE SIMPLE INTEREST USING THE ABSTRACT CLASS */

import java.util.*;

abstract class simple
 {

    double p, r, t;

    Scanner sc = new Scanner(System.in);

    abstract void si();

    void sinput() {

        System.out.print("Enter Principal Value : ");
        p = sc.nextDouble();

        System.out.print("Enter Rate Of Return : ");
        r = sc.nextDouble();

        System.out.print("Enter Time in Years : ");
        t = sc.nextDouble();
    }
}

class method extends simple {

    void si() {
        double result = (p * r * t) / 100;

        System.out.println("Simple Interest = " + result);
    }
}

class p6 {
        public static void main(String args[]) {

        method obj = new method();

        obj.sinput();
        obj.si();
    }
}				
/*
    OUTPUT:
    Enter Principal Value : 25000
    Enter Rate Of Return : 5
    Enter Time in Years : 3
    Simple Interest = 3750.0
*/
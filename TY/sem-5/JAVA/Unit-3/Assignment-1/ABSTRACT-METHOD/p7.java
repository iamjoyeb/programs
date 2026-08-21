/* WRITE A JAVA PROGRAM THAT HAS CLASS SHAPE WHICH INCLUDES THAT ABSTRACT CLASS METHOD NAME getarea(), 
    class rectangle ,triangle and circle  INHERIT
     THE CLASS  SHAPRE AND IMPLEMENTS METHOD getarea AND RETURN VALUE OF AREA RESPECTIVELY */

import java.util.*;
abstract class Shape{
    Scanner sc=new Scanner(System.in);

    double l=10,b=5,h=5,base=10,r=5;
    abstract void getarea();
}

class rectangle extends Shape{
    void getarea(){
        System.out.println("Area Of Rectangle is: "+(l*b));
    }
}

class triangle extends Shape{
    void getarea(){
        System.out.println("Area Of Triangle is: "+(0.5*base*h));
    }
}

class circle extends Shape{
    void getarea(){
        System.out.println("Area Of Circle is: "+(Math.PI*r*r));
    }
}

class p7{
    public static void main(String args[]){
        rectangle r=new rectangle();
        triangle t=new triangle();
        circle c=new circle();

        r.getarea();
        t.getarea();
        c.getarea();
    }
}
/*
    OUTPUT:
    Area Of Rectangle is: 50.0
    Area Of Triangle is: 25.0
    Area Of Circle is: 78.53981633974483
*/
/*Write a java program for hierarchical inheritance.
     class 1 Shape with draw() Method -> class circle with the draw() method
    class 1 Shape with draw() Method -> class Rectangle with the draw() method  
    class 1 Shape with draw() Method -> class triangle with the draw() method */

class Shape{
    void sdraw(){
        System.out.println("Call From Shape");
    }
}

class circle extends Shape{
    void draw(){
        System.out.println("Call From Circle");
    }
}

class rectangle extends Shape{
    void draw(){
        System.out.println("Call From Rectangle");
    }
}

class triangle extends Shape{
    void draw(){
        System.out.println("Call From Triangle");
    }
}

class p7{
    public static void main(String args[]){
        circle c=new circle();
        rectangle r=new rectangle();
        triangle t=new triangle();

        c.sdraw();
        c.draw();

        r.sdraw();
        r.draw();

        t.sdraw();
        t.draw();
    }
}
/*
    OUTPTU:
    Call From Shape
    Call From Circle
    Call From Shape
    Call From Rectangle
    Call From Shape
    Call From Triangle
*/
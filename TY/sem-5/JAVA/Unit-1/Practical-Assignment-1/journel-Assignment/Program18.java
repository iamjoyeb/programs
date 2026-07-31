// Program 18: Write a program to calculate area of a rectangle using command-line arguments.
class Program18 {
    public static void main(String args[]) {

        if (args.length != 2) {
            System.out.println("Usage: java Program18 <length> <width>");
            return;
        }

        double length = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);

        double area = length * width;

        System.out.println("Area of Rectangle");
        System.out.println("===================");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area of rectangle: " + area);
    }
}
/*
    OUTPUT:
    Area of Rectangle
    ===================
    Length: 10.0
    Width: 5.0
    Area of rectangle: 50.0
*/
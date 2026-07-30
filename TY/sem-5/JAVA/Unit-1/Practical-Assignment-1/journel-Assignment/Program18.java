import java.util.Scanner;

// Program 18: Write a program that will calculate area of rectangle.

class Program18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Area of Rectangle");
        System.out.println("===================");

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        double area = length * width;

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area of rectangle: " + area);

        sc.close();
    }
}
/*
 * SAMPLE OUTPUT:
 * Area of Rectangle
 * ===================
 * Enter length: 10
 * Enter width: 5
 * Length: 10.0
 * Width: 5.0
 * Area of rectangle: 50.0
 */

import java.util.Scanner;

// Program 17: Write a program that will calculate area of circle.

class Program17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Area of Circle");
        System.out.println("================");

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area of circle: " + area);

        sc.close();
    }
}
/*
 * SAMPLE OUTPUT:
 * Area of Circle
 * ================
 * Enter radius: 7
 * Radius: 7.0
 * Area of circle: 153.93804002589985
 */

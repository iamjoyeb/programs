// Program 17: Write a program to calculate area of a circle using command-line arguments.
class Program17 {
    public static void main(String args[]) {

        if (args.length != 1) {
            System.out.println("Usage: java Program17 <radius>");
            return;
        }

        double radius = Double.parseDouble(args[0]);

        double area = Math.PI * radius * radius;

        System.out.println("Area of Circle");
        System.out.println("================");
        System.out.println("Radius: " + radius);
        System.out.println("Area of circle: " + area);
    }
}
/*
    OUTPUT:
    Area of Circle
    ================
    Radius: 7.0
    Area of circle: 153.93804002589985
*/
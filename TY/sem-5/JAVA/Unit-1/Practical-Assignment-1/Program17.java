// Program 17: Write a program that will calculate area of circle using command line arguments.

class Program17 {
    public static void main(String args[]) {
        if (args.length < 1) {
            System.out.println("Please provide radius as command line argument.");
            return;
        }
        
        double radius = Double.parseDouble(args[0]);
        double area = Math.PI * radius * radius;
        
        System.out.println("Radius: " + radius);
        System.out.println("Area of circle: " + area);
    }
}
/* 
 * SAMPLE OUTPUT (run: java Program17 7):
 * Radius: 7.0
 * Area of circle: 153.93804002589985
 * 
 * (If no argument): Please provide radius as command line argument.
 */

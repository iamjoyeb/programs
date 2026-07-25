// Program 18: Write a program that will calculate area of rectangle using command line arguments.

class Program18 {
    public static void main(String args[]) {
        if (args.length < 2) {
            System.out.println("Please provide length and width as command line arguments.");
            return;
        }
        
        double length = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);
        double area = length * width;
        
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area of rectangle: " + area);
    }
}

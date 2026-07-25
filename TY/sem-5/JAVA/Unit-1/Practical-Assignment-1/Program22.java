// Program 22: Write a program that will calculate division of two no.s using command line arguments.

class Program22 {
    public static void main(String args[]) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }
        
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }
        
        double quotient = a / b;
        
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Division: " + quotient);
    }
}

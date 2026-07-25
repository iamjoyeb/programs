// Program 21: Write a program that will calculate multiplication of two no.s using command line arguments.

class Program21 {
    public static void main(String args[]) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }
        
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double product = a * b;
        
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Multiplication: " + product);
    }
}

// Program 20: Write a program that will calculate subtraction of two no.s using command line arguments.

class Program20 {
    public static void main(String args[]) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }
        
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double diff = a - b;
        
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Subtraction: " + diff);
    }
}

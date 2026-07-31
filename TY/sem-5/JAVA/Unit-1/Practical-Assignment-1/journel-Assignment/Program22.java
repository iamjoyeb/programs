// Program 22: Write a program to calculate division of two numbers using command-line arguments.
class Program22 {
    public static void main(String args[]) {

        if (args.length != 2) {
            System.out.println("Usage: java Program22 <first_number> <second_number>");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        System.out.println("Division of Two Numbers");
        System.out.println("========================");

        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            double quotient = a / b;

            System.out.println("First number: " + a);
            System.out.println("Second number: " + b);
            System.out.println("Division: " + quotient);
        }
    }
}
/*
    OUTPUT:
    Division of Two Numbers
    ========================
    First number: 100.0
    Second number: 3.0
    Division: 33.333333333333336
*/
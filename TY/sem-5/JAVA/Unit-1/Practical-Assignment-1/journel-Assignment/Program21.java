// Program 21: Write a program to calculate multiplication of two numbers using command-line arguments.
class Program21 {
    public static void main(String args[]) {

        if (args.length != 2) {
            System.out.println("Usage: java Program21 <first_number> <second_number>");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        double product = a * b;

        System.out.println("Multiplication of Two Numbers");
        System.out.println("==============================");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Multiplication: " + product);
    }
}
/*
    OUTPUT
    Multiplication of Two Numbers
    ==============================
    First number: 8.0
    Second number: 12.0
    Multiplication: 96.0
*/

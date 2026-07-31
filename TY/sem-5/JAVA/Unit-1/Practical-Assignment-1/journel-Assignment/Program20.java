// Program 20: Write a program to calculate subtraction of two numbers using command-line arguments.
class Program20 {
    public static void main(String args[]) {

        if (args.length != 2) {
            System.out.println("Usage: java Program20 <first_number> <second_number>");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        double diff = a - b;

        System.out.println("Subtraction of Two Numbers");
        System.out.println("===========================");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Subtraction: " + diff);
    }
}
/*
    OUTPUT:
    Subtraction of Two Numbers
    ===========================
    First number: 50.0
    Second number: 15.0
    Subtraction: 35.0
*/
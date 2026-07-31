// Program 19: Write a program to calculate addition of two numbers using command-line arguments.
class Program19 {
    public static void main(String args[]) {

        if (args.length != 2) {
            System.out.println("Usage: java Program19 <first_number> <second_number>");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        double sum = a + b;

        System.out.println("Addition of Two Numbers");
        System.out.println("========================");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Addition: " + sum);
    }
}
/*
    OUTPUT:
    Addition of Two Numbers
    ========================
    First number: 25.0
    Second number: 17.0
    Addition: 42.0
*/
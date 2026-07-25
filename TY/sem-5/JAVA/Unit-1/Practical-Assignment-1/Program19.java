// Program 19: Write a program that will calculate addition of two no.s using command line arguments.

class Program19 {
    public static void main(String args[]) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }
        
        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double sum = a + b;
            
            System.out.println("First number: " + a);
            System.out.println("Second number: " + b);
            System.out.println("Addition: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please provide numeric values for both numbers.");
        }
    }
}
/* 
 * SAMPLE OUTPUT (run: java Program19 25 17):
 * First number: 25.0
 * Second number: 17.0
 * Addition: 42.0
 * 
 * (If insufficient args): Please provide two numbers as command line arguments.
 * (If invalid argument): Invalid input! Please provide numeric values for both numbers.
 */

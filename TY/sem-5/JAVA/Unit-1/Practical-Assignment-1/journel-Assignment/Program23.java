// Program 23: Write a Java program to calculate simple interest using command-line arguments.
class Program23 {
    public static void main(String args[]) {

        if (args.length != 3) {
            System.out.println("Usage: java Program23 <principal> <rate> <time>");
            return;
        }

        double principal = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest Calculator");
        System.out.println("===========================");
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
/*OUTPUT:
Simple Interest Calculator
===========================
Principal: 10000.0
Rate: 5.5%
Time: 3.0 years
Simple Interest: 1650.0
 */
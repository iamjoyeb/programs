// Program 23: Write a java program to calculate simple interest using command line arguments.

class Program23 {
    public static void main(String args[]) {
        if (args.length < 3) {
            System.out.println("Please provide principal, rate and time as command line arguments.");
            return;
        }
        
        double principal = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);
        
        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);
    }
}

// Q5. Write a Java program to perform arithmetic operations using command-line arguments.
//     Accept two numbers and an operator (+, -, *, /) as command-line arguments
//     and display the result.

public class Program5 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Usage: java Program5 <num1> <operator> <num2>");
            System.out.println("Example: java Program5 10 + 20");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        String operator = args[1];
        double num2 = Double.parseDouble(args[2]);

        switch (operator) {
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }
}

/*
Output:
$ java Program5 10 + 20
Result: 30.0

$ java Program5 15 * 4
Result: 60.0
*/

// Q4. Write a Java program to demonstrate the use of for-each loop.
//     Create an array of integers and display all elements, find the sum,
//     and print only the even numbers using for-each loop.

public class Program4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum of elements: " + sum);

        System.out.println("\nEven numbers:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}

/*
Output:
Array elements:
10
20
30
40
50

Sum of elements: 150

Even numbers:
10
20
30
40
50
*/

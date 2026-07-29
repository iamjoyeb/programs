import java.util.Scanner;

class ShoppingItem {
    int itemCode;
    String itemName;
    double itemPrice;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item code: ");
        itemCode = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter item name: ");
        itemName = sc.nextLine();
        System.out.print("Enter item price: ");
        itemPrice = sc.nextDouble();
    }

    void display() {
        System.out.println("Code: " + itemCode + " | Name: " + itemName + " | Price: " + itemPrice);
    }
}

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        ShoppingItem[] items = new ShoppingItem[n];
        double totalSum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nItem " + (i + 1) + ":");
            items[i] = new ShoppingItem();
            items[i].getdata();
            totalSum += items[i].itemPrice;
        }

        System.out.println("\n--- Shopping List ---");
        for (ShoppingItem item : items) {
            item.display();
        }
        System.out.println("Total Price: " + totalSum);
    }
}

/*
Output:
Enter number of items: 2

Item 1:
Enter item code: 101
Enter item name: Laptop
Enter item price: 45000

Item 2:
Enter item code: 102
Enter item name: Mouse
Enter item price: 500

--- Shopping List ---
Code: 101 | Name: Laptop | Price: 45000.0
Code: 102 | Name: Mouse | Price: 500.0
Total Price: 45500.0
*/

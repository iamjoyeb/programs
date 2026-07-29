import java.util.Scanner;

class Item {
    int itemno;
    int qty;
    int rate;

    void getitem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item number: ");
        itemno = sc.nextInt();
        System.out.print("Enter quantity: ");
        qty = sc.nextInt();
        System.out.print("Enter rate: ");
        rate = sc.nextInt();
        sc.close();
    }

    void dishitem() {
        int amount = qty * rate;
        System.out.println("Item No: " + itemno + " | Qty: " + qty + " | Rate: " + rate + " | Amount: " + amount);
    }
}

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nItem " + (i + 1) + ":");
            items[i] = new Item();
            items[i].getitem();
        }

        System.out.println("\n--- Item Details ---");
        for (Item item : items) {
            item.dishitem();
        }
        sc.close();
    }
}

/*
Output:
Enter number of items: 2

Item 1:
Enter item number: 10
Enter quantity: 5
Enter rate: 100

Item 2:
Enter item number: 20
Enter quantity: 3
Enter rate: 250

--- Item Details ---
Item No: 10 | Qty: 5 | Rate: 100 | Amount: 500
Item No: 20 | Qty: 3 | Rate: 250 | Amount: 750
*/

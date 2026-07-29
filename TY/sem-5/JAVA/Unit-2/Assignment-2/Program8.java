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
    }
}

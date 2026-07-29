import java.util.Scanner;

class Book {
    int accno;
    String name;
    double price;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter accession number: ");
        accno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter book name: ");
        name = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
        sc.close();
    }

    void dish() {
        System.out.println("Acc No: " + accno + " | Name: " + name + " | Price: " + price);
    }
}

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            books[i] = new Book();
            books[i].getdata();
        }

        System.out.println("\n--- Book Details ---");
        for (Book book : books) {
            book.dish();
        }
        sc.close();
    }
}

/*
Output:
Enter number of books: 2

Book 1:
Enter accession number: 501
Enter book name: Data Structures
Enter price: 450

Book 2:
Enter accession number: 502
Enter book name: Java Programming
Enter price: 380

--- Book Details ---
Acc No: 501 | Name: Data Structures | Price: 450.0
Acc No: 502 | Name: Java Programming | Price: 380.0
*/

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
    }
}

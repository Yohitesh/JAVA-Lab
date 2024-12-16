import java.util.Scanner;

class Book {
    private String name;
    private String author;
    private double price;
    private int num_pages;

   
    public Book(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }
    public void get_details(){
        System.out.println("Book Name: " + name + ", Author: " + author + ", Price: " + price + ", Pages: " + num_pages);
    }
    public void set_details(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }
    
    @Override
    public String toString() {
        return "Book Name: " + name + ", Author: " + author + ", Price: " + price + ", Pages: " + num_pages;
    }
}

public class BookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1BM23CS085, Dama Yohitesh Naveen Sai");
        System.out.println("Enter the number of books:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Author: ");
            String author = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            System.out.print("Number of pages: ");
            int num_pages = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            books[i] = new Book(name, author, price, num_pages);
        }

        System.out.println("\nDetails of the books:");
        for (Book book : books) {
            System.out.println(book);
        }

        scanner.close();
    }
}

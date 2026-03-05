package BookStoreInventory;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Book[] books = {
                new Book("The Alchemist", "Paulo Coelho", 299.0),
                new Book("harry potter", "J.K. Rowling", 399.0),
                new Book("1984", "George Orwell", 199.0),
                new Book("Clean Code", "Robert C. Martin", 499.0),
                new Book("The Pragmatic Programmer", "Andrew Hunt", 450.0)
        };

        // Before Sorting
        System.out.println("Books before sorting:");
        for (Book b : books) {
            System.out.println(b);
        }

        // Sort by Title (Case-Insensitive)
        Arrays.sort(books, new BookTitleComparator());

        System.out.println("\nBooks after sorting by title (case-insensitive):");
        for (Book b : books) {
            System.out.println(b);
        }

        // Sort by Price (Ascending)
        Arrays.sort(books, new BookPriceComparator());

        System.out.println("\nBooks after sorting by price (ascending):");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

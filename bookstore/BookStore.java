/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Roaa
 */
public class BookStore {

    ArrayList<Book> inventory = new ArrayList<>();

    public void addBook(Book book) {
        inventory.add(book);
        System.out.println("Book added.");
    }

    public void removeOldBooks(int maxYears) {
        inventory.removeIf(book -> LocalDateTime.now().getYear() - book.getYear_published().getYear() > maxYears);
        System.out.println("Outdated books removed.");
    }

    public void buyBook(String isbn, int quantity, String email, String address) {
        for (Book book : inventory)
        {
            if (book.getISBN().equals(isbn))
            {
                if (book instanceof DemoBook)
                {
                    System.out.println("This book is not for sale.");
                    return;
                }
                if (book instanceof PaperBook)
                {
                    PaperBook pb = (PaperBook) book;
                    if (pb.getStock() < quantity)
                    {
                        System.out.println("Not enough stock.");
                        return;
                    }
                    pb.reduceStockQuantity(quantity);
                }
                double total = book.getPrice() * quantity;
                System.out.println("Paid " + total);
                book.deliver(email, address);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayInventory() {
        System.out.println("------------INVENTORY---------");
        for (Book book : inventory)
        {
            System.out.println(book.getTitle() + " (" + book.getISBN() + ")");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BookStore store = new BookStore();

        Book paper = new PaperBook(12, "ISBN123", "Java Fundamentals", LocalDateTime.of(2015, 1, 1, 0, 0), 150.0);
        Book ebook = new EBook("PDF", "ISBN456", "AI Fundementals", LocalDateTime.of(2021, 1, 1, 0, 0), 100.0);
        Book demo = new DemoBook("ISBN789", "Clean Code", LocalDateTime.of(1900, 1, 1, 0, 0), 0.0);

        store.addBook(paper);
        store.addBook(ebook);
        store.addBook(demo);

        store.displayInventory();

        store.buyBook("ISBN123", 2, "roaa@mail.com", "Cairo");
        store.buyBook("ISBN456", 1, "khaled@mail.com", "");
        store.buyBook("ISBN789", 1, "salah@mail.com", "");

        store.removeOldBooks(10);

        store.displayInventory();

    }

}

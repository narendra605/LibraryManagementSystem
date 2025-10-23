package com.library.management;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    public void showAllBooks() {
        System.out.println("\nAll Books in Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void issueBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.issueBook(user);
                return;
            }
        }
        System.out.println("Book not found in library.");
    }

    public void returnBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook(user);
                return;
            }
        }
        System.out.println("Book not found in library.");
    }
}

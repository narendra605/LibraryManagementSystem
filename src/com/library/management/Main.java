package com.library.management;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        Book b1 = new Book("JAVA", "JAMES GOSLING");
        Book b2 = new Book("The Alchemist", "Paulo Coelho");
        library.addBook(b1);
        library.addBook(b2);

        // Create users
        User u1 = new User("Narendra", 101);
        User u2 = new User("Rahul", 102);

        // Issue and return books
        library.issueBook("Java", u1);   
        library.issueBook("Java", u2);   
        library.returnBook("Java", u2);  
        library.returnBook("java", u1);  
        library.showAllBooks();
    }
}


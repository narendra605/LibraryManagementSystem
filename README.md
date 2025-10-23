# Library Management System 📚

A simple console-based Java project to manage books and users using Object-Oriented Programming (OOP) concepts.  
This project allows adding books, issuing them to users, returning books, and tracking which user has borrowed each book.

## 📘 Features
- Add new books to the library
- Issue books to users (linked with user IDs)
- Return books (only by the correct user)
- Display all books with their current status (Available / Issued)
- Tracks which user borrowed which book

## 🧠 OOP Concepts Used
- **Abstraction:** Hiding internal logic inside methods like `issueBook()` and `returnBook()`
- **Encapsulation:** Private class fields accessed via getters/setters
- **Polymorphism:** Overriding methods (like `toString()` in Book and User)
- **Relationships:**  
  - `Library` **HAS-A** `Book`  
  - `Book` **IS-A** `Object`  
  - `Book` is issued **TO-A** `User`

## 📸 Console Output
Here’s a sample of the program running in Eclipse:

![Console Output](screenshots/console.png)

## 🛠️ How to Run
1. Clone this repository:  
```bash
git clone https://github.com/narendra605/LibraryManagementSystem.git

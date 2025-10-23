package com.library.management;
public class Book {
    private String title;
    private String author;
    private boolean isIssued;
    private User issuedTo; // The user who borrowed this book

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
        this.issuedTo = null;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public User getIssuedTo() {
        return issuedTo;
    }

    public void issueBook(User user) {
        if (!isIssued) {
            isIssued = true;
            issuedTo = user;
            System.out.println(title + " has been issued to " + user.getName() + " (User ID: " + user.getUserId() + ")");
        } else {
            System.out.println(title + " is already issued to " + issuedTo.getName());
        }
    }

    public void returnBook(User user) {
        if (isIssued && issuedTo != null) {
            if (issuedTo.getUserId() == user.getUserId()) {
                isIssued = false;
                System.out.println(title + " has been returned by " + user.getName());
                issuedTo = null;
            } else {
                System.out.println("This book was not issued to " + user.getName() + ".");
            }
        } else {
            System.out.println(title + " was not issued to anyone.");
        }
    }

    @Override
    public String toString() {
        String status = isIssued
                ? "Issued to " + issuedTo.getName() + " (User ID: " + issuedTo.getUserId() + ")"
                : "Available";
        return "Book [Title: " + title + ", Author: " + author + ", Status: " + status + "]";
    }
}

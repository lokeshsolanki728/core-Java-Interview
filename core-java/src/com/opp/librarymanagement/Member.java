package com.opp.librarymanagement;

public class Member {
    String name;

    public Member(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable) {
            book.isAvailable = false;
            System.out.println(name + " borrowed " + book.title);
        } else {
            System.out.println(book.title + " is not available.");
        }
    }

    public void returnBook(Book book) {
        book.isAvailable = true;
        System.out.println(name + " returned " + book.title);
    }
}

package com.programandoenjava.parte3.Models;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {

    List<Book> allBooks = new ArrayList<>();
    Book book;

    public List<Book> allBooks() {
        for (Book book : allBooks) {
            System.out.println(book.toString());
        }
        return allBooks;
    }

    public void addBook(Book book) {
        allBooks.add(book);
        System.out.println("The book was add with success " + book.getTitle());
    }

    public Optional<Book> findBookById(int bookId) {
        for (Book book : allBooks) {
            if (book.getId() == bookId) {
                System.out.println(book.toString());
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    public void removeBook(Book book) {
        allBooks.remove(book);
    }

}




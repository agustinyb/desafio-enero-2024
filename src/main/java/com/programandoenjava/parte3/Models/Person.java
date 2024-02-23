package com.programandoenjava.parte3.Models;

import java.util.ArrayList;
import java.util.List;

public class Person {

    String name;
    int age;
    int id;

    Library library;
    Book book;

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    List<Book> myBooks = new ArrayList<>();

    public List<Book> myBooks() {
        for (Book book : myBooks) {
            System.out.println(book.toString());
        }
        return myBooks;
    }

    public String getBook(Book book) {
        myBooks().add(book);
      //  library.removeBook(book);
        return "Book got with succes";
    }

    public String returnBook(Book book) {
        myBooks().remove(book);
        //library.addBook(book);
        return "Book return with succes";
    }
}

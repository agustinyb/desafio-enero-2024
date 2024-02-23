package com.programandoenjava.parte3.Models;

public class Book {

    String title;
    String author;
    int year;
    int id;

    public Book(String title, String author, int year, int id) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "title: " + title + " " +
                "author: " + author + " " +
                "year: " + year + " " +
                "id: " + id;
    }
}

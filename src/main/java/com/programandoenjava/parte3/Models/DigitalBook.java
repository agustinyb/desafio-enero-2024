package com.programandoenjava.parte3.Models;

public class DigitalBook extends Book {

    String url;

    public DigitalBook(String title, String author, int year, int id, String url) {
        super(title, author, year, id);
        this.url = url;
    }
}




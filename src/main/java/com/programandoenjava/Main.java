package com.programandoenjava;

import com.programandoenjava.parte3.Models.Book;
import com.programandoenjava.parte3.Models.DigitalBook;
import com.programandoenjava.parte3.Models.Library;
import com.programandoenjava.parte3.Models.Person;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("El Principito", "Antoine de Saint-Exupéry", 1943, 1);
        Book book2 = new Book("Cien años de soledad", "Gabriel Garcia Marquez", 1967, 2);
        Book book3 = new Book("El Quijote", "Miguel de Cervantes", 1605, 3);
        Book book4 = new Book("El Matadero", "Esteban Echeverria", 1871, 4);
        Book book5 = new Book("Rayuela", "Julio Cortazar", 1963, 5);
        DigitalBook book6 = new DigitalBook("Matar un ruiseñor", "Harper Lee", 1960, 6, "www.books.com");


        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.removeBook(book2);


        library.allBooks();
        //library.findBookById(3);

        Person person = new Person("Agustin", 27, 1);
        person.getBook(book1);
        person.getBook(book2);
        person.getBook(book3);
        person.myBooks();
        person.returnBook(book1);
        person.myBooks();
    }
}
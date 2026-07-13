package com.axa.java.dayfive.oopsconcepts.associations.aggregations;

import java.util.List;
//Container class for Books
public class Library {
    //Aggregation: Library HAS Books, but books exist independently
    private List<Book> books;

    //Books are passed fromm the outside(Constructor Injection)
    public Library(List<Book> books) {
        this.books = books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

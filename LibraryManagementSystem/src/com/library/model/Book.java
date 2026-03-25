package com.library.model;

public class Book extends LibraryItem {

    private String genre;

    public Book(int itemId, String title, String author, String genre) {
        super(itemId, title, author);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
        System.out.println("----------------------");
    }
}
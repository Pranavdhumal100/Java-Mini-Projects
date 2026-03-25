package com.library.model;

public class LibraryItem {

    // Access Modifiers
    private int itemId;
    protected String title;
    String author; // default

    // Constructor
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getter for private field
    public int getItemId() {
        return itemId;
    }

    // Method
    public void displayDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
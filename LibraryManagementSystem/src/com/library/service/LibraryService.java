package com.library.service;

import java.util.ArrayList;
import java.util.List;

import com.library.model.LibraryItem;

public class LibraryService {

    private List<LibraryItem> items = new ArrayList<>();

    // Add item
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    // Display all items
    public void displayAllItems() {
        for (LibraryItem item : items) {
            item.displayDetails();
        }
    }
}
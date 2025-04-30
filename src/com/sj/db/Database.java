package com.sj.db;

import java.util.TreeSet;
import com.sj.model.Book;

public class Database {
    private TreeSet<Book> bookSet;

    public Database() {
        bookSet = new TreeSet<>();
    }

    public TreeSet<Book> getBookSet() {
        return bookSet;
    }

    public void setBookSet(TreeSet<Book> bookSet) {
        this.bookSet = bookSet;
    }
}

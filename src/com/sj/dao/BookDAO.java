package com.sj.dao;

import java.util.Iterator;
import java.util.TreeSet;
import com.sj.model.Book;
import com.sj.db.Database;

public class BookDAO {
    private Database db;

    public BookDAO() {
        db = new Database();
    }

    public TreeSet<Book> getBookSet() {
        return db.getBookSet();
    }

    public void setBookSet(TreeSet<Book> bookSet) {
        db.setBookSet(bookSet);
    }

    public void insertBook(Book book) {
        db.getBookSet().add(book);
    }

    public void viewAllBooks() {
        for (Book book : db.getBookSet()) {
            System.out.println(book);
        }
    }

    public boolean deleteBook(int id) {
        Iterator<Book> iterator = db.getBookSet().iterator();
        while (iterator.hasNext()) {
            Book b = iterator.next();
            if (b.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean updateBook(Book updatedBook) {
        Iterator<Book> iterator = db.getBookSet().iterator();
        while (iterator.hasNext()) {
            Book b = iterator.next();
            if (b.getId() == updatedBook.getId()) {
                iterator.remove();
                db.getBookSet().add(updatedBook);
                return true;
            }
        }
        return false;
    }
}

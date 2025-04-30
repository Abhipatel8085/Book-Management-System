package com.sj.model;

public class Book implements Comparable<Book> {
    private int id;
    private String name;
    private String authorName;
    private double price;

    public Book() {
    }

    public Book(int id, String name, String authorName, double price) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Book [ID=" + id + ", Name=" + name + ", Author=" + authorName + ", Price=" + price + "]";
    }
}

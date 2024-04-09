package com.learning.core.day3session3afternoon;

import java.util.*;

class Book1 implements Comparable<Book1> {
    private int bookId;
    private String title;
    private double price;
    private String author;
    private Date publicationDate;

    public Book1(int bookId, String title, double price, String author, Date publicationDate) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return bookId + " " + title + "\n" +
                price + " " + author + "\n" +
                publicationDate;
    }

    @Override
    public int compareTo(Book1 other) {
        return this.author.compareTo(other.author);
    }
}

public class D03P084 {
    public static void main(String[] args) {
        TreeSet<Book1> bookSet = new TreeSet<>();

        // Predefined book details
        Date date1 = new Date(120, 1, 2); // Note: Year is offset by 1900
        Date date2 = new Date(97, 4, 19);
        Date date3 = new Date(84, 10, 23);
        Date date4 = new Date(84, 10, 19);
        Date date5 = new Date(84, 2, 6);

        bookSet.add(new Book1(1001, "Python Learning", 715.0, "Martic C. Brown", date1));
        bookSet.add(new Book1(1002, "Modern Mainframe", 295.0, "Sharad", date2));
        bookSet.add(new Book1(1003, "Java Programming", 523.0, "Gilad Bracha", date3));
        bookSet.add(new Book1(1004, "Read C++", 295.0, "Henry Harvin", date4));
        bookSet.add(new Book1(1005, ".Net Platform", 3497.0, "Mark J. Price", date5));

        // Printing all book details by author names in ascending order
        for (Book1 book : bookSet) {
            System.out.println(book);
        }
    }
}

package com.pb.Koritskiy.hw5;

public class Book {
    private String nameBook;
    private String author;
    private int year;

    public Book(String nameBook, String author, int year) {
        this.nameBook = nameBook;
        this.author = author;
        this.year = year;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}

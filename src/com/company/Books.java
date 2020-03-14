package com.company;

public class Books <T> implements Writable{
private String Book;
private int year;
private int rating;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public String getBook() {
        return Book;

    }

    public void setBook(String book) {
        this.Book = book;
    }

    public Books(String nameBook,int year,int rating) {
        this.Book = nameBook;
        this.year=year;
        this.rating=rating;
    }

    @Override
    public Number WritingYear() {
        return year;
    }

    @Override
    public Number rating() {
        return rating;
    }
}

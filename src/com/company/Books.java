package com.company;

public class Books <T> implements Writable{
private String Book;
T year;
private int rating;

    public T getYear() {
        return  year;
    }

    public void setYear(T year) {
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

    public Books(String nameBook,T year,int rating) {
        this.Book = nameBook;
        this.year=year;
        this.rating=rating;
    }

    @Override
    public T WritingYear() {
        return  year;
    }

    @Override
    public Number rating() {
        return rating;
    }
}

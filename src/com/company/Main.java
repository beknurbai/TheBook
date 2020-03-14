package com.company;

public class Main {

    public static void main(String[] args) {
	Books books=new Books("Harry Potter",1997 ,5);
	Books books1=new Books("The Witcher",1993,5);
	choiceBook(books);
	choiceBook(books1);
    }
public  static<T extends Number> void choiceBook( Books<T>books){
    System.out.println(books.getBook()+" Year : "+books.WritingYear());
    System.out.println(books.getBook()+" rating : "+books.rating());

}
}

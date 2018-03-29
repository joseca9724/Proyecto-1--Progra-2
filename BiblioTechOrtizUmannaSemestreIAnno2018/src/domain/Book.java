/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author byron
 */
public class Book extends Material {

    //atributos
    private String isbn, title, author, type;
    private int year, quantity;

    //constructores
    public Book(String title, String author, int year, String type, int quantity) {
        super();
        this.isbn = "(978)9977-";
        this.title = title;
        this.author = author;
        this.year = year;
        this.type = type;
        this.quantity = quantity;

    }

    public Book() {
        super();
        this.isbn = "(978)9977-";
        this.title = "";
        this.author = "";
        this.year = 0;
        this.type = "";
        this.quantity = 0;
    }

    //sets, gets y toString
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn += isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public int getQuiantity() {
        return quantity;
    }

    public void setQuiantity(int quiantity) {
        this.quantity = quiantity;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", year=" + year + '}';
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roaa
 */

import java.time.LocalDateTime;

public abstract class Book {
    protected String ISBN;
    protected String title;
    protected LocalDateTime year_published;
    protected double price;

    public Book( String ISBN, String title, LocalDateTime year_published, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.year_published = year_published;
        this.price = price;
    }   
    
    public abstract void deliver(String email,String address);

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getYear_published() {
        return year_published;
    }

    public void setYear_published(LocalDateTime year_published) {
        this.year_published = year_published;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "ISBN=" + ISBN + ", title=" + title + ", year_published=" + year_published + ", price=" + price + '}';
    }
    
}

package com.company.task2num3;

public class Book {
    private int pages, year;
    private String name, author;

    public Book(String name, String author, int year, int pages) {
        setName(name);
        setAuthor(author);
        setYear(year);
        setPages(pages);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return "name: " + getName() +
                ", author: " + getAuthor() +
                ", year: " + getYear() +
                ", pages: " + getPages();
    }
}

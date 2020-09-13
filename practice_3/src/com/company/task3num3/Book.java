package com.company.task3num3;

public class Book {
    private String author, name, publishingHouse;
    private int pages, year;

    public Book(String name, String author, int year, int pages, String publishingHouse) {
        setName(name);
        setAuthor(author);
        setYear(year);
        setPages(pages);
        setPublishingHouse(publishingHouse);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
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

    public String toString() {
        return "Название: " + getName() +
                "\nAвтор: " + getAuthor() +
                "\nГод написания: " + getYear() +
                "\nКоличество страниц: " + getPages() +
                "\nИздательство: " + getPublishingHouse();
    }
}

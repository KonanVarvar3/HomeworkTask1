package com.homework.task1.book;

public class Book {

    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this(name, authors, price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String str = "";

        for (int i = 0; i < authors.length; i++) {
            if (i == authors.length - 1) {
                str = str.concat(authors[i].toString());
                break;
            }
            str = str.concat(authors[i].toString()).concat(",");
        }

        return "\"Book[" +
                "name=" + name +
                ",authors={" + str + "}" +
                ", price=" + price +
                ", qty=" + qty + "]\"";
    }

    public String getAuthorNames() {
        String authorNames = "\"";

        for (int i = 0; i < authors.length; i++) {
            if (i == (authors.length - 1)) {
                authorNames = authorNames.concat(authors[i].getName());
                break;
            }
            authorNames = authorNames.concat(authors[i].getName()).concat(",");
        }

        authorNames = authorNames.concat("\"");
        return authorNames;
    }
}















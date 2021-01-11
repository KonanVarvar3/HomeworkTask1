package com.homework.task1.book;

import java.util.Arrays;
import java.util.Objects;

public class Book {

    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Book book = (Book) o;

        return Double.compare(book.price, price) == 0 &&
                qty == book.qty &&
                Objects.equals(name, book.name) &&
                Arrays.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (int) (prime * result + price);
        result = prime * result + qty;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + Arrays.hashCode(authors);

        return result;
    }

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















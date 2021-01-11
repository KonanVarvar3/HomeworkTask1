package com.homework.task1.book;

import java.util.Objects;

public class Author {

    private String name;
    private String email;
    private char gender;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Author author = (Author) o;

        return gender == author.gender &&
                Objects.equals(name, author.name) &&
                Objects.equals(email, author.email);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + gender;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());

        return result;
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author[" +
                "name=" + name +
                ",email=" + email +
                ",gender=" + gender + "]";
    }

    public String getName() {
        return name;
    }


}

package com.todo.domain.model.Book;

public class Genre {
    String value;

    @Deprecated
    Genre() {
    }

    public Genre(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "value='" + value + '\'' +
                '}';
    }
}

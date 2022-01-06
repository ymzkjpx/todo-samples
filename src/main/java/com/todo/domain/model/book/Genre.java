package com.todo.domain.model.book;

import javax.validation.constraints.NotNull;

/**
 * 書籍のジャンル
 */
public class Genre {
    @NotNull
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

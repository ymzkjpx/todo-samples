package com.todo.domain.model.book;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 書籍のジャンル
 */
public class Genre {
    @NotNull
    @NotBlank
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

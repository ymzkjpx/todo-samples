package com.todo.domain.model.book;

import java.util.Collections;
import java.util.List;

import javax.validation.Valid;

/**
 * ブックス
 */
public class Books {
    List<@Valid Book> list;

    @Deprecated
    Books() {
    }

    private Books(List<Book> list) {
        this.list = list;
    }

    public static Books from(List<Book> source) {
        return new Books(source);
    }

    public static Books empty() {
        return Books.from(Collections.emptyList());
    }

    public List<Book> asList() {
        return list;
    }
}

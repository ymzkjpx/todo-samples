package com.todo.domain.model.Book;

import java.util.List;

public class Books {
    List<Book> list;

    Books(){}

    private Books(List<Book> list) {
        this.list = list;
    }

    public static Books from(List<Book> source){
        return new Books(source);
    }

    public List<Book> asList() {
        return list;
    }
}

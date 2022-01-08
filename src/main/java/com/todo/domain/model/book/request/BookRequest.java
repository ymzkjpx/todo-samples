package com.todo.domain.model.book.request;

import com.todo.domain.model.book.Genre;
import com.todo.domain.model.book.Title;
import com.todo.domain.model.book.WorkOf;

import javax.validation.Valid;

public class BookRequest {
    @Valid Title title;
    @Valid WorkOf workOf;
    @Valid Genre genre;

    private BookRequest(){}

    public BookRequest(Title title, WorkOf workOf, Genre genre) {
        this.title = title;
        this.workOf = workOf;
        this.genre = genre;
    }

    public static BookRequest empty() {
        return new BookRequest();
    }
}

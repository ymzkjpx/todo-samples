package com.todo.domain.model.book;

import com.todo.domain.model.book.request.BookRequest;

import javax.validation.Valid;

/**
 * 書籍種
 */
public class Book {
    @Valid BookNumber bookNumber;
    @Valid WorkOf workOf;
    @Valid Genre genre;
    @Valid Title title;

    @Deprecated
    Book() {
    }

    private Book(BookNumber bookNumber, WorkOf workOf, Genre genre, Title title) {
        this.bookNumber = bookNumber;
        this.workOf = workOf;
        this.genre = genre;
        this.title = title;
    }

    public static Book from(BookNumber bookNumber, WorkOf workOf, Genre genre, Title title){
        return new Book(bookNumber, workOf, genre, title);
    }

    public BookNumber bookNumber() {
        return bookNumber;
    }

    public WorkOf workOf() {
        return workOf;
    }

    public Genre genre() {
        return genre;
    }

    public Title title() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookNumber=" + bookNumber +
                ", workOf=" + workOf +
                ", genre=" + genre +
                ", title=" + title +
                '}';
    }
}

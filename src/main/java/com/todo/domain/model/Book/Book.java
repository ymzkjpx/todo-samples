package com.todo.domain.model.Book;

/**
 * 書籍種
 */
public class Book {
    BookNumber bookNumber;
    WorkOf workOf;
    Genre genre;

    @Deprecated
    Book() {
    }

    public Book(BookNumber bookNumber, WorkOf workOf, Genre genre) {
        this.bookNumber = bookNumber;
        this.workOf = workOf;
        this.genre = genre;
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
}

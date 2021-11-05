package com.todo.domain.model.Book;

/**
 * 書籍種
 */
public class Book {
    BookNumber bookNumber;
    WorkOf workOf;
    Genre genre;
    Title title;

    @Deprecated
    Book() {
    }

    public Book(BookNumber bookNumber, WorkOf workOf, Genre genre, Title title) {
        this.bookNumber = bookNumber;
        this.workOf = workOf;
        this.genre = genre;
        this.title = title;
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

package com.todo.application;

import com.todo.domain.model.book.Book;
import com.todo.domain.model.book.BookNumber;
import com.todo.domain.model.book.Books;
import com.todo.domain.model.keyword.Keyword;

public interface BookRepository {
    Book searchBook(BookNumber bookNumber);

    Books searchBooks(Keyword keyword);
}

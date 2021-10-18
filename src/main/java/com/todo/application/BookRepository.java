package com.todo.application;

import com.todo.domain.model.Book.Book;
import com.todo.domain.model.Book.BookNumber;
import com.todo.domain.model.Book.Books;
import com.todo.domain.model.keyword.Keyword;

public interface BookRepository {
    Book searchBook(BookNumber bookNumber);

    Books searchBooks(Keyword keyword);
}

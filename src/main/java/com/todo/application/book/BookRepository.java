package com.todo.application.book;

import com.todo.domain.model.book.Book;
import com.todo.domain.model.book.BookNumber;
import com.todo.domain.model.book.Books;
import com.todo.domain.model.book.request.BookRequest;
import com.todo.domain.model.keyword.Keyword;

/**
 * ブックリポジトリ
 */
public interface BookRepository {
    Book searchBook(BookNumber bookNumber);

    Books searchBooks(Keyword keyword);

    void registerBook(BookRequest book);
}

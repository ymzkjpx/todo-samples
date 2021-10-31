package com.todo.infrastructure.book;

import com.todo.application.BookRepository;
import com.todo.domain.model.Book.Book;
import com.todo.domain.model.Book.BookNumber;
import com.todo.domain.model.Book.Books;
import com.todo.domain.model.keyword.Keyword;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDatasource implements BookRepository {

    BookMapper bookMapper;

    public BookDatasource(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public Book searchBook(BookNumber bookNumber) {
        return null;
    }

    @Override
    public Books searchBooks(Keyword keyword) {
        List<Book> result = bookMapper.searchBooksByKeyword(keyword);
        if (result == null) return Books.empty();
        return Books.from(result);
    }
}

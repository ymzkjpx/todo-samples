package com.todo.infrastructure.book;

import com.todo.application.book.BookRepository;
import com.todo.domain.model.book.Book;
import com.todo.domain.model.book.BookNumber;
import com.todo.domain.model.book.Books;
import com.todo.domain.model.book.request.BookRequest;
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
        return bookMapper.searchBookByBookNumber(bookNumber);
    }

    @Override
    public Books searchBooks(Keyword keyword) {
        List<Book> result = bookMapper.searchBooksByKeyword(keyword);
        if (result == null) return Books.empty();
        return Books.from(result);
    }

    @Override
    public void registerBook(BookRequest book) {
        bookMapper.registerBook(BookNumber.generate(), book);
    }
}

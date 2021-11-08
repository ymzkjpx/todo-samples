package com.todo.application;

import com.todo.domain.model.book.Book;
import com.todo.domain.model.book.BookNumber;
import com.todo.domain.model.book.Books;
import com.todo.domain.model.keyword.Keyword;

import org.springframework.stereotype.Service;

@Service
public class BookSearchService {

    BookRepository bookRepository;

    public BookSearchService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * キーワードで本を検索する
     */
    public Books searchBooks(Keyword keyword) {
        return bookRepository.searchBooks(keyword);
    }

    /**
     * 書籍管理番号で検索する
     */
    public Book searchBook(BookNumber bookNumber) {
        return bookRepository.searchBook(bookNumber);
    }
}

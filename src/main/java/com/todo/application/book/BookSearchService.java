package com.todo.application.book;

import com.todo.domain.model.book.Book;
import com.todo.domain.model.book.BookNumber;
import com.todo.domain.model.book.Books;
import com.todo.domain.model.keyword.Keyword;

import org.springframework.stereotype.Service;

/**
 * 書籍基本検索サービス
 */
@Service
public class BookSearchService {

    BookRepository bookRepository;

    public BookSearchService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * キーワードで書籍を検索する
     */
    public Books searchBooks(Keyword keyword) {
        return bookRepository.searchBooks(keyword);
    }

    /**
     * 書籍管理番号で書籍を検索する
     */
    public Book searchBook(BookNumber bookNumber) {
        return bookRepository.searchBook(bookNumber);
    }



}

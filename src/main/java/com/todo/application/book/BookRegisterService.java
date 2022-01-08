package com.todo.application.book;

import com.todo.domain.model.book.Book;
import com.todo.domain.model.book.request.BookRequest;

import org.springframework.stereotype.Service;

/**
 * 書籍の登録・変更・削除を行うサービス
 */
@Service
public class BookRegisterService {

    BookRepository bookRepository;

    public BookRegisterService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * 書籍を新規登録する
     */
    public void registerBook(BookRequest book) {
        bookRepository.registerBook(book);
    }

    /**
     * 登録書籍情報を変更する
     */
    public void overwriteBookInfo(Book updateBook) {

    }

    /**
     * 登録書籍情報を削除する
     */
    public void remove(Book removeBook) {
    }
}

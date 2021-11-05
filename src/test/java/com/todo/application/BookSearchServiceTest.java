package com.todo.application;

import com.todo.domain.model.Book.Book;
import com.todo.domain.model.Book.BookNumber;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookSearchServiceTest {


    @Autowired
    BookSearchService bookSearchService;

    @Test
    void 書籍番号で書籍を検索できること(){
        BookNumber targetBookNumber = BookNumber
    }
}
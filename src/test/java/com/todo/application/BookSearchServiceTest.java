package com.todo.application;

import com.todo.domain.model.book.Book;
import com.todo.domain.model.book.BookNumber;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BookSearchServiceTest {

    @Autowired
    BookSearchService bookSearchService;

    @Test
    void 書籍番号で書籍を検索できること(){
        BookNumber targetBookNumber = BookNumber.fromString("530f9ad1-f3fc-4e22-a2f7-c4eeb4e41b78");
        Book result = bookSearchService.searchBook(targetBookNumber);
        assertAll(
                ()->assertEquals(targetBookNumber.value(), result.bookNumber().value()),
                ()->assertEquals("1984年", result.title().value()),
                ()->assertEquals("ジョージ・オーウェル", result.workOf().value()),
                ()->assertEquals("SF小説", result.genre().value())
        );
    }
}
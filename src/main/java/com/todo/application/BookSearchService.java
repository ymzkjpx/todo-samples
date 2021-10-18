package com.todo.application;

import com.todo.domain.model.Book.Books;
import com.todo.domain.model.keyword.Keyword;

import org.springframework.stereotype.Service;

@Service
public class BookSearchService {

    BookRepository bookRepository;

    /**
     * キーワードで本を検索する
     */
    public Books searchBooks(Keyword keyword){
        return bookRepository.searchBooks(keyword);
    }
}

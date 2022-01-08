package com.todo.infrastructure.book;

import com.todo.domain.model.book.Book;
import com.todo.domain.model.book.BookNumber;
import com.todo.domain.model.book.request.BookRequest;
import com.todo.domain.model.keyword.Keyword;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookMapper {

    List<Book> searchBooksByKeyword(@Param("keyword") Keyword keyword);

    Book searchBookByBookNumber(@Param("bookNumber") BookNumber bookNumber);

    void registerBook(@Param("nextNumber") BookNumber nextNumber, @Param("book") BookRequest book);
}

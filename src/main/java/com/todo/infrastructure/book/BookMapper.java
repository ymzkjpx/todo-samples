package com.todo.infrastructure.book;

import com.todo.domain.model.Book.Book;
import com.todo.domain.model.keyword.Keyword;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> searchBooksByKeyword(Keyword keyword);
}

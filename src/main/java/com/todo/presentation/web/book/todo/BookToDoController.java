package com.todo.presentation.web.book.todo;

import com.todo.application.book.BookSearchService;
import com.todo.domain.model.book.Books;
import com.todo.domain.model.keyword.Keyword;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book/todo")
public class BookToDoController {

    BookSearchService bookSearchService;

    public BookToDoController(BookSearchService bookSearchService) {
        this.bookSearchService = bookSearchService;
    }

    @GetMapping("/")
    public String index() {
        return "book/todo/todo";
    }

    @PostMapping("/")
    public String search(@ModelAttribute Keyword keyword,
                         Model model) {
        Books result = bookSearchService.searchBooks(keyword);
        model.addAttribute("searchResult", result);
        return "book/todo/todo";
    }

    @InitBinder
    void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.setAllowedFields(
                // Keyword
                "value"
        );
    }
}

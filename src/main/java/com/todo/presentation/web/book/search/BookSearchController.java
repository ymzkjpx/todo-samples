package com.todo.presentation.web.book.search;

import com.todo.application.book.BookSearchService;
import com.todo.domain.model.book.Books;
import com.todo.domain.model.keyword.Keyword;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book/search")
public class BookSearchController {

    BookSearchService bookSearchService;

    public BookSearchController(BookSearchService bookSearchService) {
        this.bookSearchService = bookSearchService;
    }

    @ModelAttribute("keyword")
    Keyword keyword() {
        return Keyword.empty();
    }

    @GetMapping("")
    public String index() {
        return "book/search/search";
    }

    @PostMapping("")
    public String search(@ModelAttribute("keyword") @Validated Keyword keyword,
                         BindingResult bindingResult,
                         Model model) {
        if (bindingResult.hasErrors()) return "book/search/search";
        Books result = bookSearchService.searchBooks(keyword);
        model.addAttribute("searchResult", result);
        return "book/search/search";
    }
}

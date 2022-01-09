package com.todo.presentation.web.book.todo;

import com.todo.application.book.BookRegisterService;
import com.todo.application.book.BookSearchService;
import com.todo.domain.model.book.Books;
import com.todo.domain.model.book.request.BookRequest;
import com.todo.domain.model.keyword.Keyword;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/book/todo")
public class BookTodoController {

    BookSearchService bookSearchService;
    BookRegisterService bookRegisterService;

    public BookTodoController(BookSearchService bookSearchService, BookRegisterService bookRegisterService) {
        this.bookSearchService = bookSearchService;
        this.bookRegisterService = bookRegisterService;
    }

    @ModelAttribute("bookRequest")
    BookRequest bookRequest() {
        return BookRequest.empty();
    }

    @ModelAttribute("keyword")
    Keyword keyword() {
        return Keyword.empty();
    }

    @GetMapping("")
    public String index() {
        return "book/todo/todo";
    }

    @PostMapping(value = "", params = "search")
    public String search(@ModelAttribute("keyword") @Validated Keyword keyword,
                         BindingResult bindingResult,
                         Model model) {
        if (bindingResult.hasErrors()) return "book/todo/todo";
        Books result = bookSearchService.searchBooks(keyword);
        model.addAttribute("searchResult", result);
        return "book/todo/todo";
    }

    @PostMapping(value = "", params = "register")
    @PreAuthorize("isAuthenticated()")
    public String register(@ModelAttribute("bookRequest") @Validated BookRequest bookRequest,
                           BindingResult bindingResult,
                           RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) return "book/todo/todo";
        bookRegisterService.registerBook(bookRequest);
        return "redirect:";
    }

    @InitBinder
    void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.setAllowedFields(
                // Keyword
                "value",
                // BookRequest
                "title.value",
                "workOf.value",
                "genre.value"
        );
    }
}

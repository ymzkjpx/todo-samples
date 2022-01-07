package com.todo.presentation.web.book.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book/search/")
public class BookSearchController {

    @GetMapping("/")
    public String index() {
        return "book/search/search";
    }
}

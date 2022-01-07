package com.todo.presentation.web.book.register;

import com.todo.domain.model.book.Book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/book/register/")
public class BookRegisterController {

    @GetMapping("")
    public String index() {
        return "book/register/register";
    }

    @PostMapping("")
    public String register(@ModelAttribute Book book,
                           RedirectAttributes redirectAttributes) {
        return "redirect:";
    }
}

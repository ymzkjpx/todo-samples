package com.todo.presentation.web.book.register;

import com.todo.application.book.BookRegisterService;
import com.todo.domain.model.book.Book;
import com.todo.domain.model.book.request.BookRequest;

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
@RequestMapping("/book/register/")
public class BookRegisterController {

    BookRegisterService bookRegisterService;

    public BookRegisterController(BookRegisterService bookRegisterService) {
        this.bookRegisterService = bookRegisterService;
    }

    @ModelAttribute("bookRequest")
    BookRequest bookRequest(){
        return new BookRequest();
    }

    @GetMapping("")
    public String index() {
        return "book/register/register";
    }

    @PostMapping("")
    public String register(@ModelAttribute("bookRequest") @Validated BookRequest book,
                           BindingResult bindingResult,
                           RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) return "book/register/register";
        System.out.println(book);
        bookRegisterService.registerBook(book);
        return "redirect:";
    }

    @InitBinder
    void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.setAllowedFields(
                // BookRequest
                "workOf.value",
                "genre.value",
                "title.value"
        );
    }
}

package com.todo.presentation.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class TopController {

    @GetMapping("")
    String index(){
        return "top";
    }


}

package com.todo.presentation.web;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice(basePackageClasses = BaseControllerAdvice.class)
public class BaseControllerAdvice {
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.initDirectFieldAccess();
        webDataBinder.setAllowedFields();
    }
}
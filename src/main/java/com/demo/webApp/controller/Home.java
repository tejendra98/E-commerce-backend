package com.demo.webApp.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @RequestMapping("/")
    public String greet() {
        return "Hello World!";
    }

    @GetMapping("/csrf-token")
    public CsrfToken test(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

}

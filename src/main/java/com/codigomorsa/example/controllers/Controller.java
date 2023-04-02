package com.codigomorsa.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    String hello() {
        return "Hello from Spring Boot v2 :)";
    }
}

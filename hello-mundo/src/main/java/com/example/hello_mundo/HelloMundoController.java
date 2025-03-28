package com.example.hello_mundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMundoController {
    @GetMapping("/hola")
    public String hola() {
        return "Hello Mundo desde Spring Boot!";
    }
}

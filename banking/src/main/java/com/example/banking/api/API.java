package com.example.banking.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {
    @GetMapping("test")
    public String testAPI(){
        return "Success";
    }
}

package com.example.debugging;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class MyController {

    @GetMapping("/info")
    public String getInfo(){
        String str = "hello";

        str =str.toLowerCase();
        str=str.toUpperCase();

        return str;

    }
}

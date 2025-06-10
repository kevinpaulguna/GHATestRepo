package com.example.demoSpringApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class NewRestController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World, coming from IntelliJ community edition.";
    }
}

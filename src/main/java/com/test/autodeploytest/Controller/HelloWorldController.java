package com.test.autodeploytest.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloWorldController {

    @GetMapping
    public ResponseEntity<String> helloWorld() {
        System.out.println(":::::::::::::::::: Hello");
        return ResponseEntity.ok("Hello Fuck**g World!");
    }
}

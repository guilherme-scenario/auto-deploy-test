package com.test.autodeploytest.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloWorldController {


    @GetMapping
    public ResponseEntity<String> helloWorld(@Value("${aws.secretKey}") String envTest) {
        System.out.println(":::::::::::::::::: Hello");
        System.out.println(":::::::::::::::::: " + envTest);
        return ResponseEntity.ok("Hello Fuck**g World!\n" + envTest);
    }
}

package com.test.autodeploytest.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("hello")
public class HelloWorldController {

    @Value("${my.annotation.test1}")
    private String var1;

    @Value("${my.annotation.test2}")
    private String var2;

    @Value("${my.annotation.test3}")
    private String var3;

    @Value("${my.annotation.test4}")
    private String var4;

    @Value("${my.annotation.test5}")
    private String var5;

    @Value("${my.annotation.test6}}")
    private String var6;

    @GetMapping
    public ResponseEntity<Map<String, List<String>>> helloWorld(@Value("${aws.secretKey}") String envTest) {
        System.out.println(":::::::::::::::::: Hello!!");
        System.out.println(":::::::::::::::::: " + var1);
        System.out.println(":::::::::::::::::: " + var2);
        System.out.println(":::::::::::::::::: " + var3);
        System.out.println(":::::::::::::::::: " + var4);
        System.out.println(":::::::::::::::::: " + var5);
        System.out.println(":::::::::::::::::: " + var6);
        System.out.println(":::::::::::::::::: " + envTest);
        var map = new HashMap<String, List<String>>();
        map.put("new_instance", List.of(var1, var2, var3, var4, var5, var6, envTest));
        return ResponseEntity.ok(map);
    }
}

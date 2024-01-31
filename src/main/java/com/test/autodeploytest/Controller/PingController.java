package com.test.autodeploytest.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class PingController {


    @GetMapping
    public ResponseEntity<String> ping() {

        return ResponseEntity.ok("pong!");
    }

    @GetMapping("/ping")
    public ResponseEntity<String> ping2() {

        return ResponseEntity.ok("pong Instance 1!");
    }
}

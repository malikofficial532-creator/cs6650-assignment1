package com.cs6650.helloservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/")
    public ResponseEntity<String> root() {
        log.info("Root endpoint called");
        return ResponseEntity.ok("Hello Service is running!");
    }

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        log.info("Hello endpoint called");
        return ResponseEntity.ok("Hello, World!");
    }

    @GetMapping("/hello/{name}")
    public ResponseEntity<String> sayHelloToName(@PathVariable String name) {
        log.info("Personalized hello called for: {}", name);
        return ResponseEntity.ok("Hello, " + name + "!");
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        log.info("Health check endpoint called");
        return ResponseEntity.ok("OK");
    }
}

package com.retrievejson.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MyController {
    @GetMapping("/data")
    public Flux<Map<String, Object>> getData() {
        Map<String, Object> json1 = new HashMap<>();
        json1.put("key1", "value1");
        json1.put("key2", "value2");
        Map<String, Object> json2 = new HashMap<>();
        json2.put("key3", "value3");
        json2.put("key4", "value4");
        return Flux.just(json1, json2);
    }
}

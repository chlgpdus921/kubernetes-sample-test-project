package com.example.sample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class SampleController {

    @RequestMapping("/hyeyeon")
    public String getSample() {
        return "Hello world ";
    }

    @GetMapping("/")
    public String getS(){
        return "h";
    }

}

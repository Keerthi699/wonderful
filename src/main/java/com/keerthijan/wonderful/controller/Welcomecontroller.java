package com.keerthijan.wonderful.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Welcomecontroller {

    @GetMapping(value = "/welcome")
    public String welcomeToTraining() {
        return "hello world";
    }
}

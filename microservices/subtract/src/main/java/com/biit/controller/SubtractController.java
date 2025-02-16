package com.biit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubtractController {

    @GetMapping("/subtract/{n1}/{n2}")
    int subtract(@PathVariable int n1, @PathVariable int n2){
        System.out.println("subtract method called.");
        return n1-n2;
    }
}

package com.biit.controller;

import com.biit.feign.SubtractClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private SubtractClient subtractClient;

    @GetMapping("/calc/{n1}/{sign}/{n2}")
    Integer subtract(@PathVariable String sign,
                 @PathVariable int n1, @PathVariable int n2){
        System.out.println("calc method called");
        switch(sign){
            case "+": return n1+n2;
            case "-": return subtractClient.subtract(n1, n2);
            case "*": return n1*n2;
            case "/": return n1/n2;
            default: return 0;
        }
    }

}

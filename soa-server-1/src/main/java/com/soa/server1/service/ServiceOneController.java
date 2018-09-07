package com.soa.server1.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {

    @GetMapping
    @RequestMapping("/home")
    public String getStringOne() {
        return "This is server2 controller !!";
    }
}

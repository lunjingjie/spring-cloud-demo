package com.soa.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("testZuul")
    public String toRedir() {
        return "this is config center controller";
    }
}

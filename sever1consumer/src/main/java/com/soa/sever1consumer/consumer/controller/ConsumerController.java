package com.soa.sever1consumer.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ServerRemote serverRemote;

    @RequestMapping("/consumer")
    public String getServerResponse() {
        return serverRemote.hello();
    }
}

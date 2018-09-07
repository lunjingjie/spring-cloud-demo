package com.soa.sever1consumer.consumer.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="soa-server-1")
public interface ServerRemote {

    @RequestMapping("/home")
    String hello();
}

package com.rancheer.rancher_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RancherDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RancherDemoApplication.class, args);
    }


    @GetMapping("/get")
    public String test(){
        return "hello world";
    }

}

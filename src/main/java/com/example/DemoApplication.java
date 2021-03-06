package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public String index() {
        return "hello world";
    }

    public String index(String name) {
        System.out.println("reset to project init");
        return "hello " + name;
    }
}

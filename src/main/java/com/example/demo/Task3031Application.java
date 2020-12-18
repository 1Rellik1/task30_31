package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Task3031Application {

    public static void main(String[] args) {
        SpringApplication.run(Task3031Application.class, args);
    }

    public RestTemplate restTemplate(){
        return new RestTemplateBuilder().build();
    }
}

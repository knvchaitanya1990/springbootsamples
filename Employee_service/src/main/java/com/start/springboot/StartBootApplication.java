package com.start.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@ComponentScan
@EnableAutoConfiguration
@ComponentScan({"com.chaitu.employee"})
public class StartBootApplication {

    public static void main(String[] args) {
   
     SpringApplication.run(StartBootApplication.class, args);
        
    System.out.println("started:: Spring Boot:");

      
    }
   
  
}
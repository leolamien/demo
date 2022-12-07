package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class DemoApplication {

  @GetMapping("/message")
  public String message(){
    return "yessir";
  }
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

}

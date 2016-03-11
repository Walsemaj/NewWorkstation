package com.foo.testRestService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

/*
 * https://spring.io/guides/gs/rest-service/
 * 
 * http://localhost:8080/greeting
 *  returns {"id":1,"content":"Hello, World!"}
 * 
 * http://localhost:8080/greeting?name=User
 *  returns {"id":7,"content":"Hello, User!"}
 * 	
*/	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
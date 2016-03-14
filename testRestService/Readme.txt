Reference
/*
 * https://spring.io/guides/gs/rest-service/
 */   

Objective
:Simple Springboot sample
:Simple Rest sample

Start Method
1. mvn package && java -jar target/gs-consuming-rest-0.1.0.jar
OR
2. Maven spring-boot:run

Test URL
 1. curl http://localhost:8080/greeting
 	returns {"id":1,"content":"Hello, World!"}
 
 2. curl http://localhost:8080/greeting?name=User
 	returns {"id":7,"content":"Hello, User!"}
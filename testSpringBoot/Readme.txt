Reference
https://spring.io/guides/gs/spring-boot/
https://spring.io/guides/gs/actuator-service/

Objective
:Try SpringBoot
:Try Spring Rest API 
:Create application.properties for define Port

Start Method
1. mvn package && java -jar target/gs-spring-boot-0.1.0.jar
OR
2. Maven spring-boot:run

Test URL
1. curl localhost:9000
	Greetings from Spring Boot!
2. curl localhost:9001/health
	{"status":"UP"}
3. curl -X POST localhost:9001/shutdown
	#Default
	{"timestamp":1401820343710,"error":"Method Not Allowed","status":405,"message":"Request method 'POST' not supported"}
	#After updated application.properties
	{"message":"Shutting down, bye..."}	
4. curl localhost:9000/hello-world
	{"id":1,"content":"Hello, Stranger!"}
5. curl localhost:9000/hello-world?name=test
	{"id":1,"content":"Hello, test!"}
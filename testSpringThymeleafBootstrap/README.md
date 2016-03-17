Spring Boot and Thymeleaf with Maven
====================================

Reference:
For thymeleaf
- http://blog.codeleak.pl/2014/04/how-to-spring-boot-and-thymeleaf-with-maven.html
  source: https://github.com/kolorobot/spring-boot-thymeleaf
	- http://blog.codeleak.pl/2015/11/how-to-java-8-date-time-with-thymeleaf.html
	- http://blog.codeleak.pl/2015/03/spring-boot-integration-testing-with.html
For bootstrap
- http://www.w3schools.com/bootstrap/default.asp

Objective
- Deploy thymeleaf into external container
- Integrate with bootstrap library

Start 
(External container)
1. maven install
2. Run on server
(Spring Boot container)
1. maven install
2. mvn spring-boot:run

Test (External container)
Thymeleaf
1. http://localhost:8080/testSpringThymeleafBootstrap/

2. http://localhost:8080/testSpringThymeleafBootstrap/upload
uploaded file can be found in C:\{DESKTOP}\upload-dir

3. Test Thymeleaf Layout, open http://localhost:8080/testSpringThymeleafBootstrap/list.html

Boostrap
1. http://localhost:8080/testSpringThymeleafBootstrap/bootStrapButton.html
2. http://localhost:8080/testSpringThymeleafBootstrap/bootStrapTable.html
3. http://localhost:8080/testSpringThymeleafBootstrap/bootStrapTypography.html
4. http://localhost:8080/testSpringThymeleafBootstrap/bootStrapProcessBars.html

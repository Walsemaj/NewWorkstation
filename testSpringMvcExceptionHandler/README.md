Spring Exception Handler
===========================
 
Show you how to do exception handling in Spring MVC frameworks. Normally, we use @ExceptionHandler to decide which ¡§view¡¨ should be returned back if certain exception is raised.
 
    http://www.mkyong.com/spring-mvc/spring-mvc-exceptionhandler-example/
    
First @ExceptionHandler example is only apply to a single controller. In second example, to apply it globally (all controllers), annotate a class with @ControllerAdvice.    
    
Start
1. maven install 
2. Run as > Run on server

Objective
1) Spring Exception Handler

Test
1. http://localhost:8080/testSpringMvcExceptionHandler/anything

2. http://localhost:8080/testSpringMvcExceptionHandler/error

3. http://localhost:8080/testSpringMvcExceptionHandler/io-error
Test Spring MVC Basic, redirect request amongs controllers & Flash Attributes
=================================================================================
 
In the real world applications, we are required to redirect the request from one controller to other controller.

In other words we are required to redirect the request without user interaction again.

Example : Registration controller accepts the registration request and saves the user data.
Then it has to redirect to home page after successful registration.

So here , we will have one controller for registration and another controller for getting the home page.

After registration , we are required to redirect the request to home page controller with user details.
 
Reference URL:
 
http://javainsimpleway.com/spring/spring-mvc-redirecting-model-attributes-from-one-controller-to-other-controller/

Start
1. mvn install 
2. Run as > Run on server

Test
1. http://localhost:8080/SpringMVCFlashAttributes/

Objective
Register.jsp -CustomerObj-> RegistrationController -CustomerEmailId-> HomeController -CustomerEmailId-> home.jsp 
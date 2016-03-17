Reference
https://spring.io/guides/gs/uploading-files/

Objective
:Spring Boot thymeleaf
:Simple File Upload Interface

Scope
src.main.resources.templates
	uploadForm.html
src.main.resources
	application.properties #limit the upload file size
src.main.java.testSpring.testSpringUploadFile
	Application.java
	FileUploadController.java

Start Method
1. mvn package && java -jar target/testSpringUploadFile-0.0.1-SNAPSHOT.jar
OR
2. Maven spring-boot:run

Test
1. With the server running, you need to open a browser and visit http://localhost:8080/upload

 See the upload form. Pick a (small) file and press "Upload" 
 and you should see the success page from the controller. 
 Choose a file that is too large and you will get an ugly error page.
 
2. Upload a file and name it with "/"
	see a warning at the top of page

3. Upload an empty file
	see a warning at the top of page 
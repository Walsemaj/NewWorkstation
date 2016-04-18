Test Spring Authentication via LDAP
Source: https://spring.io/guides/gs/authenticating-ldap/

Start Method
mvn install
mvn spring-boot:run

Hieratchy
|_ test-server.ldif //user configuration

Test
http://localhost:8080/login

1) joe/joespassword 
	Your login attempt was not successful, try again.
2) bob/bobspassword
	success
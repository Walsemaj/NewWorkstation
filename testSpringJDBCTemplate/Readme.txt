Reference
https://spring.io/guides/gs/relational-data-access/

Objective
:Try Lambdas expression
:Try Spring jdbc template
:Try H2 under spring boot

Start Method
1. mvn package && java -jar target/testSpringJDBCTemplate-0.0.1-SNAPSHOT.jar
OR
2. Maven spring-boot:run

Test
1. Once executed, should able to see the following:

Creating tables
Inserting customer record for John Woo
Inserting customer record for Jeff Dean
Inserting customer record for Josh Bloch
Inserting customer record for Josh Long
Querying for customer records where first_name = 'Josh':
Customer [id=3, firstName=Josh, lastName=Bloch]
Customer [id=4, firstName=Josh, lastName=Long]
Started App in 1.944 seconds (JVM running for 6.879)

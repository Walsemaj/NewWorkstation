Reference
https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html

Objective
:Different environment deployment
:Test Spring properties hierarchy
:Try @Autowired

	Properties Hierarchy
	|_ Command Line <override> 

	 sample: java -jar target/testMavenDiffEnvDeployment-0.0.1-SNAPSHOT.jar --testValue="Testing Value assigned from Command Line"

    	|_ custom-properties on classpath <override>

		 sample: java -jar -Dspring.config.location=classpath:env.properties target/testMavenDiffEnvDeployment-0.0.1-SNAPSHOT.jar
		 Or multiple properties: ... -Dspring.config.location=classpath:/default.properties,classpath:/override.properties ...
         
			|_ application.properties

			 sample: java -jar -Dspring.profiles.active=production target/testMavenDiffEnvDeployment-0.0.1-SNAPSHOT.jar

Test
Case#1 Load production environment setting via Maven
Run: mvn install -Pprod && java -jar -Dspring.config.location=classpath:env.properties target/testMavenDiffEnvDeployment-0.0.1-SNAPSHOT.jar
Result: Production Environment: Environment Production

Case#2 Load environment production spring profile
Run: mvn install && java -jar -Dspring.profiles.active=prod target/testMavenDiffEnvDeployment-0.0.1-SNAPSHOT.jar
Result: Environment: Prod Application Properties

case#3 Load environment via commandline
Run: mvn install && java -jar -Dspring.profiles.active=prod  target/testMavenDiffEnvDeployment-0.0.1-SNAPSHOT.jar --environment="CommandLine"
Result: CommandLine
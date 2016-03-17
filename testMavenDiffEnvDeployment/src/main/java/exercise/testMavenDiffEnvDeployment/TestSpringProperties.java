package exercise.testMavenDiffEnvDeployment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestSpringProperties {
	
	private String environment;
	private String testValue;
	private int randomInteger;

	@Autowired
	public TestSpringProperties(@Value("${environment}") String environment, 
			@Value("${testValue}") String testValue, 
			@Value("${random.int}") int randomInteger) {
		this.environment = environment;
		this.testValue = testValue;
		this.randomInteger = randomInteger;
		
		System.out.println(this);
	}

	public String toString() {
		return "Environment: " + environment + " Test Value: " + testValue + " Random Number: " + randomInteger;
	}

	public java.util.Properties properties() {
		return System.getProperties();
	}
}

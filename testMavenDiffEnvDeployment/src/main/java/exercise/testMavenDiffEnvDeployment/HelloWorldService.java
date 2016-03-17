package exercise.testMavenDiffEnvDeployment;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

	@Value("${testValue}")
	private String testvalue;

	public String getTestvalue() {
		return testvalue;
	}

	public void setTestvalue(String testvalue) {
		this.testvalue = testvalue;
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("MyClass Started: " + testvalue);
	}

}

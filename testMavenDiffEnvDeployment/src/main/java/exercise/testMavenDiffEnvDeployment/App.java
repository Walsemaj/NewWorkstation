package exercise.testMavenDiffEnvDeployment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner 
{		
    private static final Logger log = LoggerFactory.getLogger(App.class);
    
    @Autowired
    private HelloWorldService helloWorldService;
	
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
                
    }

	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Service Output: " + this.helloWorldService.getTestvalue());

	}
}

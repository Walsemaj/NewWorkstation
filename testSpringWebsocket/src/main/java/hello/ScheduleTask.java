package hello;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleTask {

	static volatile boolean print = true;
	
	public static void print() {
		print = !print;
	}
	
    @Autowired
    private SimpMessagingTemplate template;

    // this will send a message to an endpoint on which a client can subscribe
    @Scheduled(fixedRate = 1000)
    public void trigger() {
        // sends the message to /topic/message
//    	System.out.println("/topic/message Date: " + new Date());
//        this.template.convertAndSend("/topic/message", "Date: " + new Date());
    	convertAndSend();
    }
    
    public void convertAndSend() {
    	if(print)
    	{
    		System.out.println("/topic/message Date: " + new Date());
    		this.template.convertAndSend("/topic/message", "Date: " + new Date());
    	}
    }

}
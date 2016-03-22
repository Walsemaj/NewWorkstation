package hello; 

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriptionController{

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/subscriptionCount")
    public String subCount() {
    	System.out.println("===========Subcription Count Controller===========");
        return "done";
    }

    @RequestMapping("/sendReqeust")
    public boolean stopPrint() {
    	System.out.println("Print: " + ScheduleTask.print);
    	ScheduleTask.print();
    	return ScheduleTask.print; 
    }
}
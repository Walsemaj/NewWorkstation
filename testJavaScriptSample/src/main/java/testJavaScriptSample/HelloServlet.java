package testJavaScriptSample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// content type must be set to text/event-stream
		response.setContentType("text/event-stream");

		// encoding must be set to UTF-8
		response.setCharacterEncoding("UTF-8");

		PrintWriter writer = response.getWriter();
		int upVote = 0, downVote = 0;

		for (int i = 0; i < 10; i++) {

//			The data needs to be sent in following format. 
//			...
//			data: This is some data
//			data: a quick brown fox
//			data: jumps over a lazy dog.
//			...
//			Notice single \n in event and double \n\n in data.
//			You should get following output when the servlet is executed.
			
			System.out.println("data: " + System.currentTimeMillis() + "\n\n");
			writer.write("data: " + System.currentTimeMillis() + "\n\n");
			
			flushWithDelay(1000, writer);
			
            upVote = upVote + (int) (Math.random() * 10);
            downVote = downVote + (int) (Math.random() * 10);
            
            writer.write("event:up_vote\n");
            writer.write("data: " + upVote + "\n\n");
            
            flushWithDelay(5000, writer);
            
            writer.write("event:down_vote\n");
            writer.write("data: " + downVote + "\n\n");            
			
			flushWithDelay(1000, writer);	
		}
		writer.close();
	}
	
	private void flushWithDelay(int interval, PrintWriter writer) {
		try {
			Thread.sleep(interval);
			writer.flush();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
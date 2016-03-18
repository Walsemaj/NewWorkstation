package thymeleafexamples.layouts.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThrowCustomException {

	@RequestMapping(value = "throwException")
	public void throwCustomException() throws Exception {
		throw new Exception();
    }
}

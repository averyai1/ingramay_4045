package ingramay_Assignment0.ingramay;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ingramayController {

	@RequestMapping("/home")
	public String start() 
	{
		return "home";
		
	}
	
}

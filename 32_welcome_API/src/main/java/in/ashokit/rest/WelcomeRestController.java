package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/welcome")
	public String getWelcome() {
		
		
		String port=env.getProperty("server.port");
		String msg="Welcome to ashok IT....!! (Server Post::"+port+")";
		
		return msg;
	}
	@GetMapping("/welcome2")
	public String getWelcome2() {
		
		String msg="Welcome2 to ashok IT....!!";
		
		return msg;
	}

}

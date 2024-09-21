package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return "Welcom To Neutra Technology";
	}

}

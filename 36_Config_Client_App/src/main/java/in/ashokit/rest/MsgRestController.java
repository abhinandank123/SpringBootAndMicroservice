 package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

public class MsgRestController {
	
	@Value("${msg}")
	private String msg;
	
	@GetMapping("/data")
	public String getMsg() {
		return msg;
	}

}

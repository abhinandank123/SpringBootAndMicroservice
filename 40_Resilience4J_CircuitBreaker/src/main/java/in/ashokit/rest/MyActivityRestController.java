package in.ashokit.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.ashokit.model.Activity;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class MyActivityRestController {
	
	@GetMapping("/")
	@CircuitBreaker(name="board-api",fallbackMethod ="doWork")
	public String invokeBoredApi() {
		
	//	String url="https://www.boredapi.com/api/activity";
		String url="https://secrets-api.appbrewery.com/random";
		
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<Activity> forEntity=rt.getForEntity(url, Activity.class);
		
		Activity body=forEntity.getBody();
		String str=body.getSecret();
		//int a=10/0;
		return str;
	}
	
	public String doWork(Throwable th) {
		return "Circuit Breaker is Open State";
	}

}

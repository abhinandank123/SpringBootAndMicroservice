package in.ashokit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="32_welcome_API")
public interface WelcomeApiClient {
	
	@GetMapping("/welcomeq")
	public String invokeWelcomeApi();

}

package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // it is used to register our app as a client with eureka server

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.servlet.http.HttpFilter;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((req) ->
		req.requestMatchers("/welcome")
		.permitAll()
		.anyRequest()
		.authenticated())
		.formLogin();

		return http.build();
	}

}
   
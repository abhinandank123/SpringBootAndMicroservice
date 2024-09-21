package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entities.UserStudentEntities;
import in.ashokit.repos.UserStudentRepo;
import in.ashokit.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		
		UserService userService=context.getBean(UserService.class);
		userService.saveUser();
		
		UserStudentRepo userStudentRepo = context.getBean(UserStudentRepo.class);
		//System.out.println(userStudentRepo.getClass().getName());
		
		UserStudentEntities entity = new UserStudentEntities();
		entity .setAge(25);
		entity .setCity("sandalpur");
		entity .setEmail("sila@gmail.com");
		entity .setGender("Female");
		entity .setName("Sila");
		entity .setId(104);
		userStudentRepo.save(entity);
		System.out.println("Done ....."); 
		
		
		
	}

}

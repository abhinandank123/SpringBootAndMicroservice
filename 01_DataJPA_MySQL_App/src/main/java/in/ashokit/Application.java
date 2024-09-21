package in.ashokit;

import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.Repos.UserMasterRep;
import in.ashokit.entities.UserMasterEntity;
import in.ashokit.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		
		/*
		 * UserMasterRep userMasterRep=context.getBean(UserMasterRep.class);
		 * 
		 * UserMasterEntity userMasterEntity1= new UserMasterEntity (102, "Chandan",
		 * "ck12@gmail.com", "Male", "Patna", 21);
		 * 
		 * userMasterRep.save(userMasterEntity1);
		 */
		//Integer id=102;
		//System.out.println(userMasterRep.findById(id));
		//userMasterRep.deleteById(id);
		
		//UserService userService=new UserService();
		//userService.saveUsers();
		
		UserService userService=context.getBean(UserService.class);
		userService.saveUsers();
		
	}

}

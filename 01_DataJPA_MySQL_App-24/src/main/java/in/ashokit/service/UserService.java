package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entities.UserStudentEntities;
import in.ashokit.repos.UserStudentRepo;
@Service
public class UserService {
	@Autowired
	private UserStudentRepo userStudentRepo;
	public void saveUser() {
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

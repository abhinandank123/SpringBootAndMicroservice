package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.Repos.UserMasterRep;
import in.ashokit.entities.UserMasterEntity;

@Service
public class UserService {
	
	@Autowired
	UserMasterRep userMasterRep;
	
	
	public void getUsers() {
		
	}
	public void saveUsers() {
		UserMasterEntity userMasterEntity= new UserMasterEntity (102, "Chandan",
				  "ck12@gmail.com", "Male", "Patna", 21);
		
		userMasterRep.save(userMasterEntity);
		
	}

}

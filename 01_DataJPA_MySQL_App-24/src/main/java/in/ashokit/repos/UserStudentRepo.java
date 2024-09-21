package in.ashokit.repos;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entities.UserStudentEntities;

public interface UserStudentRepo extends CrudRepository<UserStudentEntities, Integer>{

}

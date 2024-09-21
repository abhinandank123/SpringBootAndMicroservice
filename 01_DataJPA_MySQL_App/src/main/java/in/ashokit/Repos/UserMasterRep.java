package in.ashokit.Repos;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entities.UserMasterEntity;

public interface UserMasterRep extends CrudRepository<UserMasterEntity, Integer> {

}

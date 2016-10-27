package projectx.persistence.repositories.offline;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import projectx.persistence.entities.User;
import projectx.persistence.repositories.LoginRepository;
import projectx.persistence.util.InitialData;

@Stateless
@Default
public class LoginRepositoryOffline implements LoginRepository{

	@Inject
	private InitialData db;
	
	@Override
	public User login(String username, String password){
		return db.login(username, password);
	}
}

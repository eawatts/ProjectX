package projectx.persistence.offline;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import projectx.persistence.entities.User;
import projectx.persistence.offline.database.OfflineDB;
import projectx.persistence.repositories.interfaces.LoginRepository;

@Stateless
@Default
public class LoginRepositoryOffline implements LoginRepository{

	@Inject
	private OfflineDB db;
	
	@Override
	public User login(String username, String password){
		return db.login(username, password);
	}
}

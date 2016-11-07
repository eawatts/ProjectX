package projectx.persistence.repositories.hibernate;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import projectx.persistence.entities.User;
import projectx.persistence.repositories.LoginRepository;
import projectx.persistence.repositories.hibernate.database.HibernateDatabase;

@Stateless
@Alternative // This can be used by changing beans.xml

public class LoginRepositoryHibernate implements LoginRepository {
	
	@Inject
	private HibernateDatabase db;

	@Override
	public User login(String username, String password) {
		return db.login(username, password);
	}

}

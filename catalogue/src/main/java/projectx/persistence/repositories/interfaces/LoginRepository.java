package projectx.persistence.repositories.interfaces;

import projectx.persistence.entities.User;

public interface LoginRepository {

	public User login(String user, String pass);
}

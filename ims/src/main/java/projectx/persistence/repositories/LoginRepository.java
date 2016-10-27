package projectx.persistence.repositories;

import projectx.persistence.entities.User;

public interface LoginRepository {

	public User login(String username, String password);
}

package projectx.persistence.webentities;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import projectx.persistence.entities.User;

import java.io.Serializable;

@SessionScoped
@Named("current_session")
public class CurrentSession implements Serializable {

	private static final long serialVersionUID = 1L;

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String getUserFirstName(){
		return this.user.getFirstname();
	}
	public boolean isLoggedIn(){
	
		return (user == null) ? false : true;
	}
	
	
}

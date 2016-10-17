package projectx.persistence.services;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class UserCredentials implements Serializable {
	private String user;
	
	protected String getUser() {
		return user;
		}
	protected void setUser(String user){
			this.user = user;
			}

}

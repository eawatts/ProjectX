package projectx.persistence.services;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class UserCredentials implements Serializable {
	private String user;
	
	protected void setUser(String username){
			this.user = username;
			}

}

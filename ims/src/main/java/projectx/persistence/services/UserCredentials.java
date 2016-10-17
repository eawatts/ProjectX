package projectx.persistence.services;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class UserCredentials implements Serializable {
	private String user;
	
	public void setUser(String user){
			this.user = user;

			}

}

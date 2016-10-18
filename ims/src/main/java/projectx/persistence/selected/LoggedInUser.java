package projectx.persistence.selected;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class LoggedInUser implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5091092493120875445L;
	
	private String user;
	
	public String getUser() {
	return user;
	}
	public void setUser(String user){
	this.user= user;
	}
	
}
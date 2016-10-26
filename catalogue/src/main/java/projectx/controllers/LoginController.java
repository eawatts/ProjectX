package projectx.controllers;

import java.io.Serializable;


import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.User;
import projectx.persistence.webentities.CurrentSession;
import projectx.services.LoginService;

/**
 * Used to manage the Login and Logout process. Accessed via 'login'.
 */
@Named("login")
@SessionScoped
public class LoginController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private CurrentSession currentsession;
	@Inject
	private LoginService loginservice;
	
	private String username ="";
	private String password ="";
	private String error;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String createUser(){
		return "account_create";
	}
	
	/**
	 * Will check that the Username and Password are present, 
	 * if a User is found to exist with the credentials. It will set it as the Current User.
	 * @return a page redirect to display error messages, or a redirect to the Index page.
	 */
	public String login(){
		if(username.equals("")){
			this.error = "Username Required";
			this.password = "";
			return null;
		}
		else if(password.equals("")){
			this.error = "Password Required";
			this.password = "";
			return null;
		}
		User user = loginservice.login(this.username, this.password);
		
		if(user == null){
			this.error = "Check Username or Password";
			this.password = null;
			return null;
		}
		
		currentsession.setUser(user);
		
		username = null;
		password = null;
		error = null;
		return "index";
	}
	
	/**
	 * Will log the Current User out, and clear the current session.
	 * @return a redirect to the Index page.
	 */
	public String logout(){
		this.username = null;
		this.password = null;
		this.error = null;
		currentsession.logout();
		return "index";
	}
}
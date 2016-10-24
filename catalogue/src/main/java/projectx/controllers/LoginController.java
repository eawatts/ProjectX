package projectx.controllers;

import java.io.Serializable;


import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.User;
import projectx.persistence.webentities.CurrentSession;
import projectx.services.LoginService;

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
		return "catalogue_account_create";
	}
	
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
		User user = loginservice.login("Admin", "test");
		
		if(user == null){
			this.error = "Check Username or Password";
			this.password = null;
			return null;
		}
		
		currentsession.setUser(user);
		
		username = null;
		password = null;
		error = null;
		return "catalogue_index";
	}
	
	public String logout(){
		this.username = null;
		this.password = null;
		this.error = null;
		return "catalogue_index";
	}
}

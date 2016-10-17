package projectx.persistence.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.services.LoginService;
import projectx.persistence.services.UserCredentials;

@Named(value="login")
@RequestScoped
public class LoginController {
	@Inject
	LoginService loginService;
	@Inject
	UserCredentials userCredentials;
	private String username = "";
	private String password = "";
	private String error = "";
	
	public String login(){
		if (username.equals("")){
		error = "please enter a username";
		password = "";
		return "login";
		}
		if (password.equals("")) {
		error = "please enter a password";
		password = "";
		return "login";
		}
		if(!LoginService.validateDetails(username, password)) {
				error = "Invalid login";
				password = "";
				return "login";
				}
				UserCredentials.setUser(loginService.getUserID(username));
				return "home";
	}
	public String logout() {
		UserCredentials.setUser("");
		return "login";
		}
		public String getUsername(){
		return username; }
		public String getPassword(){
		return password; }
		public String getError(){
		return error; }
		public void setUsername(String username) {
		this.username = username; }
		public void setPassword(String pass){
		this.password = pass; }
	
}

package projectx.persistence.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

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
		if(!customerService.validateDetails(username, password)) {
				error = "Invalid login";
				password = "";
				return "login";
				}
				userCredentials.setUser(loginService.getUserID(username));
				return "home";
	}
	public String logout() {
		userCredentials.setUser("");
		return "login";
		}
		public String getUsername(){
		return username; }
		public String getPassword(){
		return password; }
		public String getError(){
		return error; }
		public void setUsername(String user) {
		this.username = user; }
		public void setPassword(String pass){
		this.password = pass; }
	
}

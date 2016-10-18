package projectx.persistence.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.selected.LoggedInUser;
import projectx.persistence.services.LoginService;


@Named(value="login")
@RequestScoped
public class LoginController {
	@Inject
	LoginService loginService;
	@Inject LoggedInUser loggedInUser;
	private String username= "";
	private String password= "";
	private String error= "";
	public String login()
	{
		if(loginService.validateDetails(username, password))
		{
			loggedInUser.setUser(loginService.getUserID(username));
			return "home";
		}
		else
		{
			if (username.equals(""))
			{
				error = "please enter a username";
				password = "";
				return "login";
			}
			else if (password.equals("")) 
			{
				error = "please enter a password";
				password = "";
				return "login";
			}
			else
			{
				error = "Username and password do not match";
				password="";
				return "login";
			}
			
		}		
	
	}
	public String logout() {
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

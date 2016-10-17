package projectx.persistence.controllers;

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
	
	
	

	
}

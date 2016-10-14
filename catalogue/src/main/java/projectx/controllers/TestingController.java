package projectx.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("testing")
@RequestScoped
public class TestingController {
	
	private String testMessage = "This is a test message";
	

	public String getTestMessage() {
		return testMessage;
	}

	public void setTestMessage(String testMessage) {
		this.testMessage = testMessage;
	}
}

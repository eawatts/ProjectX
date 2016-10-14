package projectx.controllers;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

//@Named("testing")
//@SessionScoped
public class TestingController {
	
	private String testMessage = "This is a test message";
	

	public String getTestMessage() {
		return testMessage;
	}

	public void setTestMessage(String testMessage) {
		this.testMessage = testMessage;
	}
}

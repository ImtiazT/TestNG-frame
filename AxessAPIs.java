package test.java.com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import main.java.pageEvents.AxessAPIsEvents;
import main.java.pageEvents.AxessLoginPageEvents;
import test.java.com.baseTest.BaseTest;

public class AxessAPIs extends BaseTest {
	AxessAPIsEvents axessAPIsEvents = new AxessAPIsEvents();
	AxessLoginPageEvents axessLoginPageEvents = new AxessLoginPageEvents();

	
	@Test
	public void VerifyAxessAboutPage() throws IOException, InterruptedException {
		axessLoginPageEvents.verifyLoginPage();
		axessLoginPageEvents.loginToAxess();
		axessAPIsEvents.verifyaxessAPISPage();

	}

}

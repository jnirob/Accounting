package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.loginpage;

public class Login extends Base {
	@Test
	public void init() throws Exception{
		loginpage login = PageFactory.initElements(driver, loginpage.class);
		login.setuser("128563");
		login.setpass("abc123$");
		login.setclick();
	}

}

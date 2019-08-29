package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class loginpage {

	WebDriver driver;
    public loginpage(WebDriver driver) {
    	this.driver=driver;
    }
  //FindBy for locating elements 
    
   @FindBy(how = How.ID  , using="username_txt") WebElement username;
   @FindBy(how = How.ID  , using="password") WebElement password;
   @FindBy(how = How.XPATH , using = "//*[@id=\"loginForm\"]/div[6]/button") WebElement signin_button ;
   
   
public void setuser(String user)   {
	username.sendKeys(user);	
}

public void setpass(String pass)   {
	password.sendKeys(pass);
}

public void setclick()   {
 signin_button.click();
}

}

package testcases;

import java.util.concurrent.TimeUnit;

import javax.imageio.IIOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class Base {
	public static WebDriver driver = null ;
	
@BeforeSuite
 public void initialize() throws IIOException {
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)	;
		driver.get("http://10.42.65.61:9097/");
}
			
@AfterSuite
public void close() {
 Base.driver.quit();	
}
}

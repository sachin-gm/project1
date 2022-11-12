package basic_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseclass 
{
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@Parameters({"key", "value", "url"})
	@BeforeMethod
	public void openapp(String key, String value, String url) 
	{
		System.setProperty(key, value);
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Reporter.log("browser opened");
		driver.get(url);
		Reporter.log("URL opened");
		wait = new WebDriverWait(driver, 5);
		
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
		
	}

}

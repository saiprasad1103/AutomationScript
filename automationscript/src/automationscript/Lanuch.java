package automationscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Lanuch {
	

	WebDriver driver; 
	@BeforeMethod
	public void Lanching_the_Browser() 
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver = new ChromeDriver(); 
	driver.get("https://mobileworld.azurewebsites.net"); 
	driver.manage().window().maximize(); 
	}
}





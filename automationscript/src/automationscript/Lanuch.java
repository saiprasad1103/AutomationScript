package automationscript;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lanuch {
	

	WebDriver driver; 
	@Test
	public void Lanching_the_Browser() 
	{
	
	//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(); 
	driver.get("https://mobileworld.azurewebsites.net"); 
	driver.manage().window().maximize(); 
	}
}





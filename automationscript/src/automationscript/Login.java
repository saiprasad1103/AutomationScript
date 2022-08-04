package automationscript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends Lanuch
{
	
	@Test(priority = 2)
	public void Login1()
	{
		    driver.findElement(By.xpath("//button[.='SIGN IN']")).click();
		    WebElement user_name = driver.findElement(By.id("username"));
			user_name.sendKeys("saiprasd@gmail.com");
			WebElement Password = driver.findElement(By.xpath("//input[@id='password']")); 
	        Password.sendKeys("saiprasad@123");
			driver.findElement(By.xpath("//a[.='Log In']")).click();
	}
}
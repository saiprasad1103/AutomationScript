package automationscript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class contactUs_page extends Lanuch
	{
	@Test(priority = 4) 
	public void contactUs() throws Throwable 
	{
	driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click(); 
	driver.findElement(By.linkText("Contact Us")).click(); 
	Set<String> window = driver.getWindowHandles(); 
	List<String> list= new ArrayList<String>(window); 
	driver.switchTo().window(list.get(1));
	Thread.sleep(1000); 
	System.out.println(driver.getTitle());
	WebElement ele3 = driver.findElement(By.cssSelector("h3[class='title']")); 
	driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Sai Prasad"); 
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("saiprasad@gmail.com");
	driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("1234567890"); 
	driver.findElement(By.xpath("//*[@name='message']")).sendKeys("Hii how are you"); 
	driver.findElement(By.xpath("//*[@type='submit']")).click(); 
	}
}
	








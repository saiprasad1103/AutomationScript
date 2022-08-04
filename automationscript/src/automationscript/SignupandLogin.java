package automationscript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;



public class SignupandLogin extends Lanuch 
	{ 
	@Test(priority = 1)
	public void Sigup_for_mobiles() throws InterruptedException, AWTException 
	{ 
	WebElement Signin = driver.findElement(By.xpath("//button[text()='SIGN IN']"));
	Signin.click();
	WebElement Signup = driver.findElement(By.xpath("//a[text()='Sign up']"));
	Signup.click(); 
	WebElement firstname = driver.findElement(By.xpath("//input[@id='myName']")); 
	firstname.sendKeys("Sai");
	WebElement Last_name = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	Last_name.sendKeys("Prasad ");
	WebElement Email = driver.findElement(By.xpath("//input[@type='Email']")); 
	Email.sendKeys("saiprasad@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@type='Password']")); 
	password.sendKeys("saiprasad@123");
	Robot ro=new Robot();
	driver.findElement(By.xpath("//input[@type='date']")).sendKeys("0408");
	ro.keyPress(KeyEvent.VK_TAB);
	driver.findElement(By.xpath("//input[@type='date']")).sendKeys("2022");
	WebElement Phone_number = driver.findElement(By.xpath("//input[@type='number']")); 
	Phone_number.sendKeys("9003727309"); 
	driver.findElement(By.xpath("//input[@type='radio']")).click(); 
    driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Are we ready to Evolve Beyond Speed"); 
	Thread.sleep(1000);
    driver.findElement(By.xpath("//button[.='Register']")).click();
	}
	
}

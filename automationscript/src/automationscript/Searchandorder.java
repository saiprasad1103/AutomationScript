package automationscript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.awt.Robot;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import 	org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.appium.java_client.android.nativekey.KeyEvent;

public class Searchandorder extends Lanuch 
	{
	@Test
	 public void search() throws InterruptedException 
	
	{ 
	driver.findElement(By.xpath("//a[.='All Mobiles']")).click(); 
	driver.findElement(By.id("myInput")).sendKeys("Apple Iphone 13"); 
	Thread.sleep(2000); 
	driver.findElement(By.xpath("(//a[.='Order'])[4]")).click();
	Set<String> window = driver.getWindowHandles();
	Iterator<String> it = window.iterator(); 
	Thread.sleep(1000);
	String parentId = it.next(); 
	String childId = it.next();
	driver.switchTo().window(childId);
	driver.findElement(By.id("inputFirstName")).sendKeys("sai"); 
	driver.findElement(By.xpath("(//*[@id='inputFirstName'])[2]")).sendKeys("prasad g");
	driver.findElement(By.id("inputEmail")).sendKeys("Saiprasad@gmail.com");
	driver.findElement(By.id("inputPassword")).sendKeys("Sai@123"); 
	driver.findElement(By.id("flexRadioDefault1")).click(); 
	driver.findElement(By.xpath("//*[@placeholder='00000000000']")).sendKeys("123456");
	driver.findElement(By.id(" address1")).sendKeys("67/35 ayyavoo street shenoy nagar"); 
	driver.findElement(By.id("address2")).sendKeys("67/35 ayyavoo street shenoy nagar");
	driver.findElement(By.id("inputCity")).sendKeys("Chennai");
	WebElement dropdown = driver.findElement(By.id("inputState")); 
	Select sle= new Select(dropdown); sle.selectByVisibleText("Tamil Nadu");
	driver.findElement(By.id("inputZip")).sendKeys("600030");
	driver.findElement(By.xpath("//input[@rel='samsung']")).click();
	driver.findElement(By.xpath("//*[.='Apple']")).click();
	driver.findElement(By.xpath("(//option[@id='apple'])[2]")).click();
	driver.findElement(By.cssSelector("input[placeholder='no of mobiles']")).sendKeys("3");
	WebElement dpdwn2 = driver.findElement(By.id("bought"));
	Select sle2= new Select(dpdwn2); 
	sle2.selectByValue("0");
	driver.findElement(By.xpath("//*[@id='gridCheck1']")).click(); 
	driver.findElement(By.xpath("(//*[@id='gridCheck1'])[2]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		} 
	}


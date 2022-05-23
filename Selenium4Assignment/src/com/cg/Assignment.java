package com.cg;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VDURGA\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.id("email")).sendKeys("Automate12@gmail.com");
	  driver.findElement(By.id("passwd")).sendKeys("12345");
	  driver.findElement(By.id("SubmitLogin")).click();
	  Actions a=new Actions(driver);
	  WebElement element = driver.findElement(By.xpath("//a[@title='Women']"));
	  a.moveToElement(element).perform();
	  driver.findElement(By.xpath("//a[@title='T-shirts']")).click();
	WebElement element1 = driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
	  a.moveToElement(element1).perform();
	  driver.findElement(By.xpath("//a[@title='View']")).click();
	  driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']")).click();
	  WebElement element3=driver.findElement(By.cssSelector("#group_1"));
	  Select select=new Select(element3);
	  select.selectByIndex(2);
	  //to the color
	  driver.findElement(By.cssSelector("a[title='Orange']")).click();
	  //Adding to the Cart
	  driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
	  //Clicking on proceed to checkout button
   driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
   driver.close();
   
	


	}

}

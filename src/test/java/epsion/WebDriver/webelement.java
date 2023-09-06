package epsion.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webelement {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup(); //it will download the driver executable
		WebDriver driver = new EdgeDriver();
		
	driver.manage().window().fullscreen();
	//load URL
	driver.get("https://demo.actitime.com/login.do");
	
	//to enter the data in the text field
	WebElement un = driver.findElement(By.name("username"));
	un.sendKeys("tej");
	
	//to wait
	Thread.sleep(3000);
	
	//to clear the text
	un.clear();
	
	//to get the tag name
	 String tagName=un.getTagName();
	 System.out.println(tagName);
	 
	 //to get the attribute name
	 String attributevalue=un.getAttribute("");
	 
	 //to get the CSS value'
	 
	
	
	
				
	}
}


package epsion.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {
	public static void main(String[] args) {
		
	//launch browser
		WebDriverManager.edgedriver().setup(); //it will download the driver executable
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		// load url
		driver.get("https://demo.actitime.com/login.do");
		
		//identify the username textfield
		WebElement usernametextfield= driver.findElement(By.id("username"));
		System.out.println("username identified");
		
		usernametextfield.sendKeys("trainee");
		
		//identify the password text field
		//WebElement passwordtextfield = driver.findElement(By.name("pwd"));
		System.out.println("password identified");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("trainee");
		
		//passwordtextfield.sendKeys("trainee");
		
		//identify login button
		WebElement loginbtn = driver.findElement(By.id("loginButton"));
		System.out.println("loginbtn identified");
		loginbtn.click();
		
		
		//linktext
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		//partial link text --works like contains operation 
		//driver.findElement(By.partialLinkText("Forgot")).click();
		
		//xpath by text function//
		//xpath by attribute//
		
		
				
		
	}
	}



package epsion.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup(); //it will download the driver executable
		WebDriver driver = new EdgeDriver();
		
		//load the application - get()
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("Actitime loaded");
		
		//manage()
				driver.manage().window().fullscreen();
				
				//identify the username textfield
				WebElement usernametextfield= driver.findElement(By.id("username"));
				System.out.println("username identified");
				
				usernametextfield.sendKeys("admin");
				
				//identify the password text field
				WebElement passwordtextfield = driver.findElement(By.name("pwd"));
				System.out.println("password identified");
				
				passwordtextfield.sendKeys("manager");
				
				//identify login button
				WebElement loginbtn = driver.findElement(By.id("loginButton"));
				System.out.println("loginbtn identified");
				loginbtn.click();
				
				//identify Task button
				Thread.sleep(5000);
				WebElement taskbtn = driver.findElement(By.xpath("//div[@id='container_tasks']"));
				System.out.println("Task identified");
				taskbtn.click();
				
				//check all boxes
				List<WebElement> allcheckboxes=driver.findElements(By.xpath("//div[@class='img']"));
				for(int i=1;i<allcheckboxes.size();i++)
				{
					for(WebElement ele:allcheckboxes) 
					{
						ele.click();
					}
				}
				
	}
}

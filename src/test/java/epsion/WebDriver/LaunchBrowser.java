package epsion.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup(); //it will download the driver executable
		WebDriver driver = new EdgeDriver();
		//https://demoqa.com/select-menu
		//load the application - get()
		driver.get("https://flipkart.com");
		System.out.println("flipkart loaded");
		
		//manage()
				driver.manage().window().fullscreen();
				
		
		//to get the page title - getTitle();
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get the current URL of the page - getCurrentURL()
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		//to get the page source - getPageSource()
		//String page source = driver.getPageSource();
		//System.out.println(page source);
		
		//to get the window handle (window ID) - getWindowhandle()
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		
		
		//quit will close all the existing  tabs and browser
		//driver.quit();
		//System.out.println("Browser closed");
		
		//close will close the current window
		//driver.close();
		
		
		
		
		
	}

	
}

package epsion.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownList {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		// Step 2: Load the application URL
		driver.get("https://demoqa.com/select-menu");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300);", "");

		//Create an object of select class
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		
		Select sel = new Select(dropdown);
		sel.selectByIndex(5);
		System.out.println("data selected");
		
		Thread.sleep(2000);
		sel.selectByValue("7");

		Thread.sleep(2000);
		sel.selectByVisibleText("Magenta");
		
		js.executeScript("window.scrollBy(0,300);", "");
		
		//Multi select drop down
		WebElement carsdropdown = driver.findElement(By.id("cars"));
		
		Select se = new Select(carsdropdown);
		se.selectByValue("volvo");
		
		Thread.sleep(2000);
		
		se.selectByValue("audi");
		
		Thread.sleep(2000);
		se.selectByVisibleText("Saab");
		
		Thread.sleep(2000);
		se.deselectByValue("volvo");
		
		se.deselectAll();
		System.out.println("all selected options are deselected");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

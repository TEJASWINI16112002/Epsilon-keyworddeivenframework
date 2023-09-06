package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//rule 1: create a seperate pom class for a webpage
	//rule 2: identify the web element using @FindBy annotation
	@FindBy(name="username")
	private WebElement usernameEdt;
	
	@FindBy(name="pwd")
	private WebElement passwordEdt;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	
	//rule3: create a constructor for element intitialisation
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//rule 4: provide getters

	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	//if we are sure about identifying elements we can create a business library
	public void loginToApp(String USERNAME,String PASSWORD) {
		usernameEdt.sendKeys(USERNAME);
		passwordEdt.sendKeys(PASSWORD);
		loginBtn.click();
	}

}

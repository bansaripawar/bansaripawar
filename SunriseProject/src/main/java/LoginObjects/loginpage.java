package LoginObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class loginpage extends Base

{
	// Navigate to Username
	@FindBy(xpath= "//input[@placeholder = 'Enter User Name']")
	WebElement username;
	
	//Navigate to Password
	@FindBy(xpath= "//input[@placeholder = 'Enter Password']")
	WebElement password;
	
	//Navigate to Login button
	@FindBy(xpath= "//button[@type = 'submit']")
	WebElement login;
	
	

	public loginpage() throws IOException 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void ValidateLogin()
	{
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		login.click();
	}
}

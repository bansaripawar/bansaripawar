package Masters;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class DesignationObjects extends Base
{
	
	//Hover on Master
	@FindBy(xpath = "//span[text()='Master']")
	WebElement Master;
	
	//Hover on Employee
	@FindBy(xpath = "//span[text()='Employee']")
	WebElement Employee;
	
	@FindBy(xpath = "//span[text()='Designation']")
	WebElement Designation;
	
	


	public DesignationObjects() throws IOException 
	{
		PageFactory.initElements(driver, this);

	}
	
	public void ValidateDesignation() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(Master).perform();
		Thread.sleep(3000);
		action.moveToElement(Employee).perform();
		Thread.sleep(3000);
		action.moveToElement(Designation).click().perform();
		
	}
}


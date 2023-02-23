package ParametersMasters;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class Clarity extends Base
{
		//Hover on Master
		@FindBy(xpath = "//span[text()='Master']")
		WebElement Master;
		
		//Hover on Employee
		@FindBy(xpath = "//span[text()='Parameters']")
		WebElement Parameters;
		
		@FindBy(xpath = "//span[text()='Clarity']")
		WebElement Clarity;
		
		public Clarity() throws IOException 
		{
			PageFactory.initElements(driver, this);
	
		}
		
		public void ValidateClarity() throws InterruptedException
		{
			Actions action = new Actions(driver);
			action.moveToElement(Master).perform();
			Thread.sleep(3000);
			action.moveToElement(Parameters).perform();
			Thread.sleep(3000);
			action.moveToElement(Clarity).click().perform();
		
		}

	
}

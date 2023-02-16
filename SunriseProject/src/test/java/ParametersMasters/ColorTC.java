package ParametersMasters;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import LoginObjects.loginpage;

public class ColorTC extends Base
{
	loginpage lp;
	Color cl;
	
	public ColorTC() throws IOException 
	{
		super();
	}

	@BeforeMethod
	public void browsersetup() throws IOException, InterruptedException
	{
		initialization();
		lp = new loginpage();
		cl = new Color();
		Thread.sleep(3000);
	}
	
  @Test
  public void ValidateColor() throws InterruptedException 
  {
	  lp.ValidateLogin();
	  Thread.sleep(3000);
	  cl.ValidateColor();
  }
}

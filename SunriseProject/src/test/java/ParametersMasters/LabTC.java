package ParametersMasters;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import LoginObjects.loginpage;


public class LabTC extends Base
{
	loginpage lp;
	Lab lb;
	
	public LabTC() throws IOException 
	{
		super();
	}

	@BeforeMethod
	public void browsersetup() throws IOException, InterruptedException
	{
		initialization();
		lp = new loginpage();
		lb = new Lab();
		Thread.sleep(3000);
	}
	
  @Test
  public void ValidateLab() throws InterruptedException 
  {
	  lp.ValidateLogin();
	  Thread.sleep(3000);
	  lb.ValidateLab();
  }
}

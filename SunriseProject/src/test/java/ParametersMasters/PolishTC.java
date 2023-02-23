package ParametersMasters;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import LoginObjects.loginpage;

public class PolishTC extends Base
{
	loginpage lp;
	Polish psh;
	
	public PolishTC() throws IOException 
	{
		super();
	}

	@BeforeMethod
	public void browsersetup() throws IOException, InterruptedException
	{
		initialization();
		lp = new loginpage();
		psh = new Polish();
		Thread.sleep(3000);
	}
	
  @Test
  public void ValidatePolish() throws InterruptedException 
  {
	  lp.ValidateLogin();
	  Thread.sleep(3000);
	  psh.ValidatePolish();
  }
}

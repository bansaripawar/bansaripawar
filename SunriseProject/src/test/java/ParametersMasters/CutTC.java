package ParametersMasters;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import LoginObjects.loginpage;

public class CutTC extends Base
{
	loginpage lp;
	Cut cut;
	
	public CutTC() throws IOException 
	{
		super();
	}

	@BeforeMethod
	public void browsersetup() throws IOException, InterruptedException
	{
		initialization();
		lp = new loginpage();
		cut = new Cut();
		Thread.sleep(3000);
	}
	
  @Test
  public void ValidateCut() throws InterruptedException 
  {
	  lp.ValidateLogin();
	  Thread.sleep(3000);
	  cut.ValidateCut();
  }
}

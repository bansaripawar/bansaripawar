package ParametersMasters;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import LoginObjects.loginpage;

public class ClarityTC extends Base
{
	loginpage lp;
	Clarity cty;
	
	public ClarityTC() throws IOException 
	{
		super();
	}

	@BeforeMethod
	public void browsersetup() throws IOException, InterruptedException
	{
		initialization();
		lp = new loginpage();
		cty = new Clarity();
		Thread.sleep(3000);
	}
	
  @Test
  public void ValidateClarity() throws InterruptedException 
  {
	  lp.ValidateLogin();
	  Thread.sleep(3000);
	  cty.ValidateClarity();
  }
}

package ParametersMasters;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import LoginObjects.loginpage;


public class FlourTC extends Base
{
	loginpage lp;
	Flour fl;
	
	public FlourTC() throws IOException 
	{
		super();
	}

	@BeforeMethod
	public void browsersetup() throws IOException, InterruptedException
	{
		initialization();
		lp = new loginpage();
		fl = new Flour();
		Thread.sleep(3000);
	}
	
  @Test
  public void ValidateFlour() throws InterruptedException 
  {
	  lp.ValidateLogin();
	  Thread.sleep(3000);
	  fl.ValidateFlour();
  }
}

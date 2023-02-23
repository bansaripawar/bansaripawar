package ParametersMasters;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import LoginObjects.loginpage;


public class CuletTC extends Base
{
	loginpage lp;
	Culet cl;
	
	public CuletTC() throws IOException 
	{
		super();
	}

	@BeforeMethod
	public void browsersetup() throws IOException, InterruptedException
	{
		initialization();
		lp = new loginpage();
		cl = new Culet();
		Thread.sleep(3000);
	}
	
  @Test
  public void ValidateCulet() throws InterruptedException 
  {
	  lp.ValidateLogin();
	  Thread.sleep(3000);
	  cl.ValidateCulet();
  }
}

package ParametersMasters;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import LoginObjects.loginpage;


public class GirdleTC extends Base
{
	loginpage lp;
	Girdle gl;
	
	public GirdleTC() throws IOException 
	{
		super();
	}

	@BeforeMethod
	public void browsersetup() throws IOException, InterruptedException
	{
		initialization();
		lp = new loginpage();
		gl = new Girdle();
		Thread.sleep(3000);
	}
	
  @Test
  public void ValidateGirdle() throws InterruptedException 
  {
	  lp.ValidateLogin();
	  Thread.sleep(3000);
	  gl.ValidateGirdle();
  }
}

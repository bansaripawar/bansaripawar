package LoginTestcase;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import LoginObjects.loginpage;

public class LoginTC extends Base
{
	loginpage lp;//Object
	
	public LoginTC() throws IOException 
	{
		super();
	
	}

	@BeforeMethod
	public void browsersetup() throws InterruptedException, IOException
	{
		initialization();
		lp = new loginpage();
		Thread.sleep(5000);
		
	}


	@Test
	public void loginpage() 
	{
		lp.ValidateLogin();
	}
}

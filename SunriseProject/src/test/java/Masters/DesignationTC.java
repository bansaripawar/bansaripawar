package Masters;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import LoginObjects.loginpage;

public class DesignationTC extends Base
{
	loginpage lp;//Login Object
	DesignationObjects dp;// Designation Object
	
	public DesignationTC() throws IOException 
	{
		super();
		
	}
	
	@BeforeMethod
	public void browsersetup() throws InterruptedException, IOException
	{
		initialization();
		lp = new loginpage();
		dp = new DesignationObjects();
		Thread.sleep(5000);
		
	}

	  @Test
	  public void DesignationObjects() throws InterruptedException 
	  {
		  lp.ValidateLogin();
		  Thread.sleep(2000);
		  dp.ValidateDesignation();
		  
	  }
	  
}

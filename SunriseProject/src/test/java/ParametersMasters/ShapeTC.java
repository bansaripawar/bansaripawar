package ParametersMasters;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import LoginObjects.loginpage;

public class ShapeTC extends Base
{
	loginpage lp;//Login Object
	Shape sp;//Shape Object
	
	public ShapeTC() throws IOException 
	{
		super();
		
	}
	@BeforeMethod
	public void browsersetup() throws InterruptedException, IOException
	{
		initialization();
		lp = new loginpage();
		sp = new Shape();
		Thread.sleep(5000);
		
	}
	
	@Test
	public void f() throws InterruptedException 
	{
	
		lp.ValidateLogin();
		Thread.sleep(2000);
		sp.ValidateShape();
		
	}
	  
}

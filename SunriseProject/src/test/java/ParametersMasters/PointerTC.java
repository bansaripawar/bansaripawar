package ParametersMasters;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import LoginObjects.loginpage;

public class PointerTC extends Base
{
	loginpage lp;//Login Object
	Pointer pt;//Pointer Object
	
	public PointerTC() throws IOException 
	{
		super();
		
	}
	@BeforeMethod
	public void browsersetup() throws IOException, InterruptedException
	{
		initialization();
		lp= new loginpage();
		pt= new Pointer();
		Thread.sleep(3000);
	}
	
  @Test
	public void Pointer() throws InterruptedException 
	{
		lp.ValidateLogin();
		Thread.sleep(2000);
		pt.ValidatePointer();
	}
}

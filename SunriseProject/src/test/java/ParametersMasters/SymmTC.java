package ParametersMasters;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import LoginObjects.loginpage;

public class SymmTC extends Base
{
	loginpage lp;
	Symm sym;
	
	public SymmTC() throws IOException 
	{
		super();
	}

	@BeforeMethod
	public void browsersetup() throws IOException, InterruptedException
	{
		initialization();
		lp = new loginpage();
		sym = new Symm();
		Thread.sleep(3000);
	}
	
  @Test
  public void ValidatePolish() throws InterruptedException 
  {
	  lp.ValidateLogin();
	  Thread.sleep(3000);
	  sym.ValidateSymm();
  }
}

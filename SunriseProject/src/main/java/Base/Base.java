package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{

		public static WebDriver driver;
		public static Properties prop;
		
		//Base Constructor
		public Base() throws IOException
		{
			
			prop = new Properties();
			try
			{
				FileInputStream ip = new FileInputStream("C:\\Users\\er220\\OneDrive\\Desktop\\Tntra\\Bansari\\Automation\\Sunrise_ERP\\SunriseProject\\src\\main\\java\\Credentials\\Credentials.properties");
				prop.load(ip);
			}
			//Error handler
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
						
		}
		
		//Initialization
		public static void initialization()
		{
			
			String browserName = prop.getProperty("browser");
			
			if(browserName.equalsIgnoreCase("Chrome"))
			{
				driver = new ChromeDriver();
			}
			
			driver.manage().window().maximize();
			
			driver.get(prop.getProperty("url"));
			
		}
	
}

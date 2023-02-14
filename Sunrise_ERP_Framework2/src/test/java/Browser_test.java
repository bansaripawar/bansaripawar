import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser_test {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\er220\\OneDrive\\Desktop\\Tntra\\Bansari\\Automation\\Sunrise_ERP\\Sunrise_ERP_Framework\\Drivers\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://3.109.51.172/login");
		driver.manage().window().maximize();
		
		//Element for User-name field
				WebElement uname=driver.findElement(By.xpath("//*[@id=\"root\"]/section/form/div/div[2]/div/div[1]/div/div/div/div/span/input"));
				
				//Element for Password field
				WebElement pwd=driver.findElement(By.xpath("//*[@id=\"root\"]/section/form/div/div[2]/div/div[2]/div/div/div/div/span/input"));

				//Element for login button
				WebElement submit=driver.findElement(By.xpath("//*[@id=\"root\"]/section/form/div/div[2]/div/div[4]/button"));
				
				//Sending in User-name field
				uname.sendKeys("BANSARIPAWAR");
				
				//Sending in password field 
				pwd.sendKeys("Sunrise@123");
				
				//Clicking on login button
				submit.click();
				
				//Element for login button
				//WebElement submit=driver.findElement(By.xpath("//*[@id=\"root\"]/section/form/div/div[2]/div/div[4]/button"));
				
		try
		{
			Thread.sleep(3000);
			
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		//driver.close();
	}
	
	
}

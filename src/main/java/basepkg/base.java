package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base 
{
	public static WebDriver driver ;
	
	public static  void browser()
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rushikesh Deshmukh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	      
	        driver= new ChromeDriver();
	        driver.get("https://www.myntra.com/");
	        driver.manage().window().maximize();
	        
	}
}

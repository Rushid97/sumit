package testkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basepkg.base;
import utilitypkgkg.Utilitypkg;

public class Testclass extends base
{
	WebDriver driver ;
	base b =new base();
	Utilitypkg util= new Utilitypkg();
	
	
	
	@Test
	public void start() throws InterruptedException {
		
	base.browser();
	driver.getTitle();
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(men).perform();
	
		
	}
	
	
	
}

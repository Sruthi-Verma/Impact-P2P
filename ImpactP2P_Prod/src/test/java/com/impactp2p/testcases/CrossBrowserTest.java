package com.impactp2p.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.impactp2p.pages.SigninPage;

public class CrossBrowserTest
{
	WebDriver driver=null;
	String projectPath = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeClass
	public void setup(String browserName) 
	{
		System.out.println("Browser name is : "+browserName);
		System.out.println("Thread id : "+Thread.currentThread().getId());
		
	  if(browserName.equalsIgnoreCase("chrome"))
		{
		    System.setProperty("webdriver.chrome.whitelistedIps", "");

			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Thinkpad\\\\eclipse-workspace\\\\Financepeer\\\\ImpactP2P_Prod\\\\src\\\\test\\\\resources\\\\chromedriverEclipse.exe");
			driver = new ChromeDriver();
			driver.get("https://impactp2p.com");
			driver.manage().window().maximize();
		 }
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Thinkpad\\eclipse-workspace\\Financepeer\\ImpactP2P_Prod\\src\\test\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://impactp2p.com");
		}
			driver.manage().window().maximize();
        }
	  @Test public void login() {
        driver.findElement(By.xpath("//*[text()='SIGN IN']")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("fpwm");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test1234");
		driver.findElement(By.xpath("//*[@id='login']")).click();
		System.out.println("Wealth Manager Dashboard");
 		
	   }

	
	
	@AfterClass
	public void teardown() 
	{
		//driver.close();
	}
}

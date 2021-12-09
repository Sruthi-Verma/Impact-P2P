package com.impactp2p.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.impactp2p.base.TestBase;
import com.impactp2p.pages.SignupPage;


public class SignupPageTest extends TestBase
{
	public static SignupPage signupPage;	
	
	public SignupPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void startTest(ITestResult result) 
	{
		initialization();
		signupPage=new SignupPage();
		testStart(result);
		}
	
	@BeforeTest
	public void getReports()
	{
		getSysInfo();
	}
	
	
  @Test(priority=1, enabled=true)
  public void SignupLink() throws Throwable
	{
	  
	   String textlink = signupPage.signupLink();
	   Assert.assertEquals(textlink, prop.getProperty("exp_textlink")); 
	   System.out.println(textlink);
	   Thread.sleep(5000);
	   
	         }
	
  @Test(priority=2, enabled=true)
  public void SignupFieldsBlanks() throws Throwable
	  {
	  
	  String profileName =signupPage.signupFieldsBlanks();
	  Assert.assertEquals(profileName, prop.getProperty("exp_ValidationMessageAll")); 
	  System.out.println(profileName);
	  
	  }
   
  @Test(priority=3, enabled=true)
  public void SignupOptionalWithoutData() throws Throwable
	  {
	  
	  String profileName =signupPage.signupOptionalWithoutData(prop.getProperty("Password"), prop.getProperty("CPassword"));
	  Assert.assertEquals(profileName, prop.getProperty("exp_ValidationMessageReg")); 
	  System.out.println(profileName);
	  
	  }
   	
  @Test(priority=4, enabled=true)
  public void SignupOptionalWithData() throws Throwable
	  {
	  
	  String profileName =signupPage.signupOptionalWithData(prop.getProperty("Password"), prop.getProperty("CPassword"));
	  Assert.assertEquals(profileName, prop.getProperty("exp_ValidationMessageReg")); 
	  System.out.println(profileName);
	  
	  }
  
  @Test(priority=5, enabled=true)
  public void SignupOptionalWithCombinationData() throws Throwable
	  {
	  
	  String profileName =signupPage.signupOptionalWithCombinationData(prop.getProperty("Password"), prop.getProperty("CPassword"),prop.getProperty("DReferCode"));
	  Assert.assertEquals(profileName, prop.getProperty("exp_ValidationMessageReg")); 
	  System.out.println(profileName);
	  
	  }
   	
  
  @Test(priority=6, enabled=true)
  public void SignupFullNameWithMaxLnth() throws Throwable
	  {
	  
	  String profileName =signupPage.signupFullNameWithMaxLnth(prop.getProperty("Password"), prop.getProperty("CPassword"));
	  Assert.assertEquals(profileName, prop.getProperty("exp_ValidationMessage6")); 
	  System.out.println(profileName);
	  
	  }
  
  @Test(priority=7, enabled=true)
  public void SignupFullNameWithMinLnth() throws Throwable
	  {
	  
	  String profileName =signupPage.signupFullNameWithMinLnth(prop.getProperty("Password"), prop.getProperty("CPassword"));
	  Assert.assertEquals(profileName, prop.getProperty("exp_ValidationMessage7")); 
	  System.out.println(profileName);
	  
	  }
   
	@AfterTest
	public void endTest() 
	{
		endReport();
	}
	
	@AfterMethod
	public void getStatus(ITestResult result) throws IOException 
	{
		getTestStatus(result);
		//driver.close();
	}
	
}

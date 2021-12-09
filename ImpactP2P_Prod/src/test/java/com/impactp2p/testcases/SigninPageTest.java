package com.impactp2p.testcases;


import java.io.IOException;



import org.testng.Assert;
import org.testng.ITestResult;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;
import com.impactp2p.base.TestBase;
import com.impactp2p.pages.SigninPage;

public class SigninPageTest extends TestBase
  {
	public static SigninPage signinPage;

	boolean result;

	public SigninPageTest()
	  {
		super();
	  }

	/*@BeforeClass
	public void setUp() 
	  {
		initialization();
		signinPage = new SigninPage();
	  }*/

	@BeforeMethod
	public void startTest(ITestResult result) 
	  {
		initialization();
		signinPage = new SigninPage();
		testStart(result);

	    }
	
	@BeforeTest
	public void getReports() 
	{	

		getSysInfo();
	}

	@Test(priority = 1, enabled = true)
	public void getPageTitle() 
	 {
		String act_title = signinPage.getPageTitle();
		String exp_title = "ImpactP2P | Powered by Financepeer";
		Assert.assertEquals(act_title, exp_title);
		System.out.println(act_title);
	   }
	
	
	@Test(priority = 2, enabled = true)
	public void signinWithValidCredentials() throws Throwable
	  {
		String profileName = signinPage.signinWithValidCredentials(prop.getProperty("email"),
				prop.getProperty("password"));
		Assert.assertEquals(profileName, prop.getProperty("exp_profileName"));
		System.out.println(profileName);
	   }

	
	@Test(priority = 3, enabled = true)
	public void forgotpassword() throws Throwable 
	   {
		signinPage.forgotpassword();
	    }

	
	@Test(priority = 4, enabled = true)
	public void signinWithEnterKwd() throws Throwable 
	   {
		String ValidationMessage = signinPage.signinWithEnterKwd(prop.getProperty("email"),
				prop.getProperty("password"));
		Thread.sleep(5000);
		Assert.assertEquals(ValidationMessage, prop.getProperty("exp_profileName"));
		System.out.println(ValidationMessage);
		
	     }
	
	
	@Test(priority = 5, enabled = true)
	public void signinWithPwdPatterns() throws Throwable 
	  {
		 signinPage.signinWithPwdPatterns(prop.getProperty("email"),prop.getProperty("Passwordp2"));
		 Thread.sleep(5000);
	  }
	
	
	@Test(priority = 6, enabled = true)
	public void backAndForwardButtons() throws Throwable 
	  {
		
		Assert.assertTrue(signinPage.backAndForwardButtons(prop.getProperty("email"),prop.getProperty("password")));

	  }
	

	@Test(priority = 7, enabled = true)
	public void signinWithGapsInText() throws Throwable 
	  {
		String ValidationMessage = signinPage.signinWithGapsInText(prop.getProperty("GEmail"),
				prop.getProperty("GPasswod"));
		Thread.sleep(5000);
		Assert.assertEquals(ValidationMessage, prop.getProperty("exp_ValidationMessage"));
		System.out.println(ValidationMessage);
		
	     }
	
	
	@Test(priority = 8, enabled = true)
	public void signinWithMaxLength() throws Throwable 
	  {
		String ValidationMessage = signinPage.signinWithMaxLength(prop.getProperty("Email"),
				prop.getProperty("Passwod"));
		Thread.sleep(5000);
		Assert.assertEquals(ValidationMessage, prop.getProperty("exp_ValidationMessage6"));
		System.out.println(ValidationMessage);
		
	     }
	
	
	@Test(priority = 9, enabled = true)
	public void signinWithMinLength() throws Throwable 
	  {
		String ValidationMessage = signinPage.signinWithMinLength(prop.getProperty("Email"),
				prop.getProperty("Passwod"));
		Thread.sleep(5000);
		Assert.assertEquals(ValidationMessage, prop.getProperty("exp_ValidationMessage7"));
		System.out.println(ValidationMessage);
		
	     }
	
	@Test(priority = 10, enabled = true)
	public void signinWithCombOfAll() throws Throwable 
	  {
		String ValidationMessage = signinPage.signinWithCombOfAll(prop.getProperty("EmailComb"),
				prop.getProperty("PasswordComb"));
		Thread.sleep(5000);
		Assert.assertEquals(ValidationMessage, prop.getProperty("exp_ValidationMsgValid"));
		System.out.println(ValidationMessage);
		
	     }
	
   @Test(priority = 11, enabled = true)
	public void signinWithInValidCredentials() throws Throwable 
	  {
		String ValidationMessage = signinPage.signinWithInValidCredentials(prop.getProperty("Inemail1"),
				prop.getProperty("Inpasswod1"));
		Thread.sleep(5000);
		Assert.assertEquals(ValidationMessage, prop.getProperty("exp_ValidationMessage"));
		System.out.println(ValidationMessage);
		
	     }
   
   
	@Test(priority = 12, enabled = true)
	public void signinWithInValidPwd() throws Throwable
	  {
		String ValidationMessage = signinPage.signinWithInValidPwd(prop.getProperty("email1"),
				prop.getProperty("Inpassword"));
		Thread.sleep(5000);
		Assert.assertEquals(ValidationMessage, prop.getProperty("exp_ValidationMessage"));
		System.out.println(ValidationMessage);
		
	     }

	@Test(priority = 13, enabled = true)
	public void signinWithInValidEmail() throws Throwable 
	  {
		String ValidationMessage = signinPage.signinWithInValidEmail(prop.getProperty("Inemail"),
				prop.getProperty("password1"));
		Thread.sleep(5000);
		Assert.assertEquals(ValidationMessage, prop.getProperty("exp_ValidationMessage"));
		System.out.println(ValidationMessage);
		
	     }

	@Test(priority = 14, enabled = true)
	public void SigninWithblankFields() throws Throwable 
	  {
		String ValidationMessage = signinPage.signinWithblankFields(prop.getProperty("bemail"),
				prop.getProperty("bpassword"));
		Thread.sleep(5000);
		Assert.assertEquals(ValidationMessage, prop.getProperty("exp_ValidationMessageAll"));
		System.out.println(ValidationMessage);
	     }

	
	@AfterTest
	public void endTest() {
		endReport();
	}

	@AfterMethod
	public void getStatus(ITestResult result) throws IOException
	{
		getTestStatus(result);
	    driver.close();
     }

	/*@AfterClass
	public void tearDown()
	{
		driver.close();
	}*/

}

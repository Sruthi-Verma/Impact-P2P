package com.impactp2p.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.impactp2p.base.TestBase;
import com.impactp2p.utilities.Testutilities;


	
public class SigninPage extends TestBase
{
	
	
	@FindBy(xpath="//*[@title='Go to Google Home']")
	WebElement invalidurl;
	
	@FindBy(xpath="//*[text()='SIGN IN']")
	WebElement signinBtn;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='login']")
	WebElement login;

	@FindBy(xpath="//*[@class='forgot-password']/a")
	WebElement forgotpassword;
	
	@FindBy(xpath="//*[text()='Wealth Manager Dashboard']")
	WebElement profileName;
	
	@FindBy(xpath="//*[text()='Invalid EmailId or Password.']")
	WebElement validationMsg;

	@FindBy(xpath="//*[text()='This site can’t be reached']")
	WebElement siteCantReached;
	
	@FindBy(xpath = "//*[@class='panel-header']")
	WebElement SignintoFp;

	
	public SigninPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
//1.To check if the user is able to view to the Title of application with a valid URI
	
public String getPageTitle()
	  {
		return driver.getTitle();
	  }

//3 and 15.To check if the user is able to View to the signin if he/she enters valid credentials(sanity testing)
   
public String signinWithValidCredentials(String emailid, String pwd) throws Throwable
 	{
 		signinBtn.click();
 		Thread.sleep(5000);
 		email.sendKeys(emailid);
 		password.sendKeys(pwd);
 		login.click();
 		WebDriverWait wait = new WebDriverWait(driver,20);
 		wait.until(ExpectedConditions.visibilityOf(profileName));
 		return profileName.getText();
 	}

//5.Verify the ‘Forgot Password’ functionality
 	
public String forgotpassword() throws Throwable 
	 {
		signinBtn.click();
		Thread.sleep(5000);
		forgotpassword.click();
		return null;
		
		}
	
//7.Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
	
public String signinWithEnterKwd(String emailid,String pwd) throws  Exception
	{
		signinBtn.click();
		Thread.sleep(5000);
		email.sendKeys(emailid);
		password.sendKeys(pwd);
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(profileName));
		return profileName.getText();
 		  }
	
//8.Verify if the data in password field is either visible as asterisk or bullet signs.
	
public void signinWithPwdPatterns(String emailid,String pwd) throws  Exception
	{
		signinBtn.click();
		Thread.sleep(5000);
		email.sendKeys(emailid);
		password.sendKeys(pwd);
		System.out.println(password.getAttribute("value"));
       }
	
//11.Verify the login page by pressing ‘Back button’ and forward button of the browser once you in dashboard, It should not allow you to enter into the system once you click on back button,it should show signin page
	
public boolean backAndForwardButtons(String emailid,String pwd) throws  Exception
	  {
			signinBtn.click();
			email.sendKeys(emailid);
			password.sendKeys(pwd);
			login.click();
			Thread.sleep(5000);
			driver.navigate().back();
			Object currentURL = "";
			if (driver.getCurrentUrl().equals(currentURL)) {
				return true;
			} else
				return false;
	   }
	
//13.Verify the username and password field functionality accept gaps in between text
	
public String signinWithGapsInText(String emailid, String pwd) throws Throwable
 	{
		signinBtn.click();
		Thread.sleep(5000);
		email.sendKeys(emailid);
		password.sendKeys(pwd);
		login.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(validationMsg));
		return validationMsg.getText();
 	}
	
//17.Verify if a user cannot enter the characters more than the specified range in each field (Username and Password).
  
public String signinWithMaxLength(String emailid, String pwd) throws Throwable
    {
		signinBtn.click();
		Thread.sleep(5000);
		email.sendKeys(Testutilities.RandomChars(30));
		password.sendKeys(Testutilities.RandomChars(30));
		login.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(validationMsg));
		return validationMsg.getText();
     }
  
//18.Verify if a user cannot enter the characters less than the specified range in each field (Username and Password).
  
 public String signinWithMinLength(String emailid, String pwd) throws Throwable
     {
			signinBtn.click();
			Thread.sleep(5000);
			email.sendKeys(Testutilities.RandomChars(1));
			password.sendKeys(Testutilities.RandomChars(1));
			login.click();
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(validationMsg));
			return validationMsg.getText();
	
     }
  
 //19.Verify if a user cannot enter the characters,alphabets and digits combination of all (Username and Password).
  
 public String signinWithCombOfAll(String emailid, String pwd) throws Throwable
     {
		signinBtn.click();
		Thread.sleep(5000);
		email.sendKeys(emailid);
		password.sendKeys(pwd);
		login.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(validationMsg));
		return validationMsg.getText();
	
      }
  
//20.Verify the validationmessages for invalid login
	
public String signinWithInValidCredentials(String emailid, String pwd) throws Throwable
	  {
	 	signinBtn.click();
		Thread.sleep(5000);
		email.sendKeys(emailid);
		password.sendKeys(pwd);
		login.click();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(validationMsg));
		return validationMsg.getText();
		
	   }
	
//21.Verify if user cannot login with a valid Username and invalid password
	
public String signinWithInValidPwd(String emailid, String pwd) throws Throwable
      {
		signinBtn.click();
		Thread.sleep(5000);
		email.sendKeys(emailid);
		password.sendKeys(pwd);
		login.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(validationMsg));
		return validationMsg.getText();
		
        }

//22.Verify if a user cannot login with a invalid username and an valid password.

public String signinWithInValidEmail(String emailid, String pwd) throws Throwable
     {
		signinBtn.click();
		Thread.sleep(5000);
		email.sendKeys(emailid);
		password.sendKeys(pwd);
		login.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(validationMsg));
		return validationMsg.getText();
     }

//23.Verify the login page for both, when both the fields are blank and login button is clicked.

public String signinWithblankFields(String emailid, String pwd) throws Throwable
   {
		signinBtn.click();
		Thread.sleep(5000);
		email.sendKeys(emailid);
		password.sendKeys(pwd);
		login.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(validationMsg));
		return validationMsg.getText();
      }


}



	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



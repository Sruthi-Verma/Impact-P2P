package com.impactp2p.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.impactp2p.base.TestBase;
import com.impactp2p.utilities.Testutilities;

public class SignupPage extends TestBase
{
	
//XPaths
	
	@FindBy(xpath="//*[text()='INVEST']")
	WebElement investbtn;	
	@FindBy(xpath="//*[text()='New asset class to invest']")
	WebElement title;	
	@FindBy(xpath="//*[text()='BORROW']")
	WebElement borrowbtn;
	@FindBy(xpath="//*[contains(@class,'hoverable center')][1]")
	WebElement registerbtn;	
    @FindBy(xpath="//*[contains(text(),'Sign Up')]")
	WebElement signup;	
	
	
	@FindBy(xpath="//*[@id='referCode']")
	WebElement Refcode;
	@FindBy(xpath="//*[@id='name']")
	WebElement Name;
	@FindBy(xpath="//*[@id='email']")
	WebElement Email;
	@FindBy(xpath="//*[@id='phone']")
	WebElement Phone;
	@FindBy(xpath="//*[@id='password']")
	WebElement Pass;
	@FindBy(xpath="//*[@id='cpassword']")
	WebElement cPass;
	@FindBy(css ="label[for='checkTerms']")
	WebElement CheckBox;
	@FindBy(xpath="//*[contains(text(),'REGISTER')]")
	WebElement Register;
	@FindBy(xpath="//*[contains(text(),'Invalid Email Id')]")
	WebElement ValidationMesg;
	@FindBy(xpath="//*[contains(text(),'Registration Successful')]")
	WebElement RegisterSuccful;
	
	public SignupPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
//14.Check whether the signup link for the new user is working
	
	   public String signupLink() throws Throwable 
		{
			borrowbtn.click();
		    Thread.sleep(5000);
		    registerbtn.click();
		    Thread.sleep(5000);
		    WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(signup));
			return signup.getText();		
			}	
	   
//24.Verify the Register page for all fields, when the all fields are blank and Register button is clicked.
	   
	   public String signupFieldsBlanks() throws Throwable 
		{
			borrowbtn.click();
		    registerbtn.click();
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CheckBox);
		    Thread.sleep(1000);
		    WebElement CheckBoxBtn = driver.findElement(By.xpath("//*[@id='checkTerms']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", CheckBoxBtn);
		    Register.click();
            return ValidationMesg.getText();
			
			}	
	   
//26.Check the optional field when do not fill data in signup page
   
	   public String signupOptionalWithoutData(String Spwd,String SCpwd) throws Throwable 
		{
			borrowbtn.click();
		    registerbtn.click();
		    Refcode.sendKeys(Testutilities.RandomChars(0));
		    Thread.sleep(2000);
            Name.sendKeys(Testutilities.RandomChars(5));
		    Email.sendKeys(Testutilities.RandomChars(5)+ "@gmail.com");
		    Phone.sendKeys(Testutilities.RandomIntgs(10));
		    Pass.sendKeys(Spwd);
		    cPass.sendKeys(SCpwd);
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CheckBox);
		    Thread.sleep(1000);
		    WebElement CheckBoxBtn = driver.findElement(By.xpath("//*[@id='checkTerms']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", CheckBoxBtn);
		    Register.click();
		    Thread.sleep(3000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RegisterSuccful);
            return RegisterSuccful.getText();
			}	

//27.Check the optional field when filling data in signuppage
	   
	   public String signupOptionalWithData(String Spwd,String SCpwd) throws Throwable 
		{
			borrowbtn.click();
		    registerbtn.click();
		    Refcode.sendKeys(Testutilities.RandomChars(3));
		    Thread.sleep(2000);
            Name.sendKeys(Testutilities.RandomChars(5));
            Email.sendKeys(Testutilities.RandomChars(5)+ "@gmail.com");
		    Phone.sendKeys(Testutilities.RandomIntgs(10));
		    Pass.sendKeys(Spwd);
		    cPass.sendKeys(SCpwd);
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CheckBox);
		    Thread.sleep(1000);
		    WebElement CheckBoxBtn = driver.findElement(By.xpath("//*[@id='checkTerms']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", CheckBoxBtn);
		    Register.click();
		    Thread.sleep(3000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RegisterSuccful);
            return RegisterSuccful.getText();
            
			}	

//28.Check the optional field with special characters,digits,alphbets and combination of all in signuppage
	   
	   public String signupOptionalWithCombinationData(String Spwd,String SCpwd,String refercode) throws Throwable 
		{
			borrowbtn.click();
		    registerbtn.click();
		    Refcode.sendKeys(refercode);
		    Thread.sleep(2000);
            Name.sendKeys(Testutilities.RandomChars(5));
            Email.sendKeys(Testutilities.RandomChars(5)+ "@gmail.com");
		    Phone.sendKeys(Testutilities.RandomIntgs(10));
		    Pass.sendKeys(Spwd);
		    cPass.sendKeys(SCpwd);
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CheckBox);
		    Thread.sleep(1000);
		    WebElement CheckBoxBtn = driver.findElement(By.xpath("//*[@id='checkTerms']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", CheckBoxBtn);
		    Register.click();
		    Thread.sleep(3000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RegisterSuccful);
            return RegisterSuccful.getText();
            
			}	
	   
//29.Verify the Full Name field How much is the maximum length of text field in signuppage
	   
	   public String signupFullNameWithMaxLnth(String Spwd,String SCpwd) throws Throwable 
		{
			borrowbtn.click();
		    registerbtn.click();
		    Refcode.sendKeys(Testutilities.RandomChars(3));
		    Name.sendKeys(Testutilities.RandomChars(130));
		    Thread.sleep(2000);
            Email.sendKeys(Testutilities.RandomChars(5)+ "@gmail.com");
		    Phone.sendKeys(Testutilities.RandomIntgs(10));
		    Pass.sendKeys(Spwd);
		    cPass.sendKeys(SCpwd);
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CheckBox);
		    Thread.sleep(1000);
		    WebElement CheckBoxBtn = driver.findElement(By.xpath("//*[@id='checkTerms']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", CheckBoxBtn);
		    Register.click();
		    Thread.sleep(3000);
           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RegisterSuccful);
           return RegisterSuccful.getText();
           
			}	

//30.Verify the Full Name field How much is the minimum length of text field in signuppage
	   
	   public String signupFullNameWithMinLnth(String Spwd,String SCpwd) throws Throwable 
		{
			borrowbtn.click();
		    registerbtn.click();
		    Refcode.sendKeys(Testutilities.RandomChars(3));
		    Name.sendKeys(Testutilities.RandomChars(1));
		    Thread.sleep(2000);
		    Email.sendKeys(Testutilities.RandomChars(5)+ "@gmail.com");
		    Phone.sendKeys(Testutilities.RandomIntgs(10));
		    Pass.sendKeys(Spwd);
		    cPass.sendKeys(SCpwd);
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CheckBox);
		    Thread.sleep(1000);
		    WebElement CheckBoxBtn = driver.findElement(By.xpath("//*[@id='checkTerms']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", CheckBoxBtn);
		    Register.click();
		    Thread.sleep(3000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RegisterSuccful);
            return RegisterSuccful.getText();
          
			}	
}
	
	
	
	
	
	
	
	
	
	
	



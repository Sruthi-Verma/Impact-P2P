package com.impactp2p.testcases;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.impactp2p.base.TestBase;
import com.impactp2p.pages.Sanitypage;


public class SanityPageTest extends TestBase
{
   public static Sanitypage SanityPage;
	
	public SanityPageTest()
	   {
		super();
	     }
	   
 @BeforeMethod
 
 public void startTest(ITestResult result) 
	{	
		initialization();
		SanityPage=new Sanitypage();
		testStart(result);
	 }
	
 @BeforeTest
 
 public void getReports()
	 {
		getSysInfo();
	  }	
 
	
 @Test(priority=1,enabled=true)
 
 public void SignupIndividualLender() throws Throwable
	    {
	      String profileName=SanityPage.SignupIndividualLender(prop.getProperty("Password"),prop.getProperty("CPassword"));
		  Thread.sleep(5000);
		  Assert.assertEquals(profileName, prop.getProperty("exp_ValidationMessageReg")); 
		  System.out.println(profileName);
		  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
           }
	
 @Test(priority=2, enabled=true)
 
 public void SigninWithValidCredentials() throws Throwable
		{
		  String profileName = SanityPage.SigninWithValidCredentials(prop.getProperty("email"),prop.getProperty("password"));
		  Assert.assertEquals(profileName, prop.getProperty("exp_profileName")); 
		  System.out.println(profileName);
	        }
	
 @Test(priority=3, enabled=true)
 
 public void OnBehalfLenderLogin() throws Throwable
		{
		  String[] expValidations = new String[] {"Wallet Balance: ₹0","0", "₹0", "₹0", "₹0","₹0",
				                                 "Existing Investments","No Investments yet",
                                                 "Closed Investments","No Closed Investments yet"};
		  String[] actualValidations = SanityPage.OnBehalfLenderLogin(prop.getProperty("email"), prop.getProperty("password"),prop.getProperty("LenderName"), prop.getProperty("PanNumber"));
		  Assert.assertEquals(actualValidations, expValidations); 
          System.out.println(Arrays.toString(actualValidations));
		}
	 
 @Test(priority=4,enabled=true)
 
 public void MinimumHoldingPeriod() throws Throwable
	   {
		  String profileName=SanityPage.MinimumHoldingPeriod(prop.getProperty("email"), prop.getProperty("password"),prop.getProperty("LenderName"), prop.getProperty("PanNumber"),prop.getProperty("AmountEnter"),prop.getProperty("AmountDropdown"));
		  Thread.sleep(5000);
		  Assert.assertEquals(profileName, prop.getProperty("ManagerDashboard")); 
		  System.out.println(profileName);
		  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
             }
	 
 @Test(priority=5,enabled=true)
 
 public void AddMoneyToWallet() throws Throwable
	    {
	       String profileName=SanityPage.AddMoneyToWallet(prop.getProperty("email"), prop.getProperty("password"),prop.getProperty("LenderName"), prop.getProperty("PanNumber"),prop.getProperty("AmountWallet"));
		   Thread.sleep(5000);
	       Assert.assertEquals(profileName, prop.getProperty("Welcomefinancepeer")); 
	       System.out.println(profileName);
            }
	 
 @Test(priority=6,enabled=true)
 
 public void FpwmMyprofileFail() throws Throwable
	    {
		  Assert.assertTrue(SanityPage.FpwmMyprofileFail(prop.getProperty("email"), prop.getProperty("password")));
	       }
            
 @Test(priority=7,enabled=true)
 
 public void BankDetails() throws Throwable
	    {
	  String profileName=SanityPage.BankDetails(prop.getProperty("email"), prop.getProperty("password"));
	  Assert.assertEquals(profileName, prop.getProperty("PleaseEnterAllDetails")); 
	  System.out.println(profileName);
	       }
	 
 @Test(priority=8,enabled=false)
 
 public void AddLender() throws Throwable
	    {
	      SanityPage.AddLender(prop.getProperty("email"), prop.getProperty("password"),prop.getProperty("RmNameSelect"),prop.getProperty("SharePercentageNM1"),prop.getProperty("SharePercentageNM2"),prop.getProperty("SharePercentageNM3"));
		  Thread.sleep(5000);
		    }
	 
 @Test(priority=9,enabled=true)
 
 public void OnBehalfLenderLoginInWFAddFunds() throws Throwable
	    {
		  String profileName= SanityPage.OnBehalfLenderLoginInWFAddFunds(prop.getProperty("WEmail"), prop.getProperty("WPassword"),prop.getProperty("lenderName"), prop.getProperty("PanNumber"),prop.getProperty("BorrowerAmount"));
		  Thread.sleep(5000);
		  Assert.assertEquals(profileName, prop.getProperty("WelocomeFP")); 
		  System.out.println(profileName);
		    }
	 
 @Test(priority=10,enabled=true)
 
 public void StartInvestment() throws Throwable
	    {
		  String profileName=SanityPage.StartInvestment(prop.getProperty("WEmail"), prop.getProperty("WPassword"),prop.getProperty("lenderName"),prop.getProperty("PanNumber"),prop.getProperty("BorrowerAmount"));
		  Assert.assertEquals(profileName, prop.getProperty("StartInvestmentProfile")); 
	      System.out.println(profileName);
           }
	 
 @Test(priority=11,enabled=true)
 
 public void DownLoadsAndEsign() throws Throwable
	    {
	      String  profileName=SanityPage.DownLoadsAndEsign(prop.getProperty("WEmail"), prop.getProperty("WPassword"),prop.getProperty("lenderName"), prop.getProperty("PanNumber"));
		  Thread.sleep(5000);
		  Assert.assertEquals(profileName, prop.getProperty("FinancepeerProfile")); 
		  System.out.println(profileName);
		   }
	 
 @Test(priority=12,enabled=true)
 
 public void OnBehalfWalletRecharge() throws Throwable
	    {
		String profileName= SanityPage.OnBehalfWalletRecharge(prop.getProperty("WEmail"), prop.getProperty("WPassword"),prop.getProperty("lenderNameWa"));
		Thread.sleep(5000);
		Assert.assertEquals(profileName, prop.getProperty("WalletRechargeText")); 
		System.out.println(profileName);
            }
	 
 @Test(priority=13,enabled=true)
 
 public void InvestNow() throws Throwable
	    {
	 String profileName=SanityPage.InvestNow(prop.getProperty("WEmail"), prop.getProperty("WPassword"), prop.getProperty("BorrowerAmount"));
	    Thread.sleep(5000);
	    Assert.assertEquals(profileName, prop.getProperty("Investnowprofile")); 
		System.out.println(profileName);
            }
    
 @Test(priority=14,enabled=true)
 
 public void DownloadsCommisionOverview() throws Throwable
	    {
	     String  profileName=SanityPage.DownloadsCommisionOverview(prop.getProperty("WEmail"),prop.getProperty("WPassword"));
		 Thread.sleep(5000);
		 Assert.assertEquals(profileName, prop.getProperty("commisionoverviewprofile")); 
		 System.out.println(profileName);
		   }
    
 @Test(priority=15,enabled=true)
 
 public void LoanDetailsCommisionRecords() throws Throwable
	    {
	      String profileName= SanityPage.LoanDetailsCommisionRecords(prop.getProperty("WEmail"),prop.getProperty("WPassword"));
		  Thread.sleep(5000);
		  Assert.assertEquals(profileName, prop.getProperty("CommisinecordsProfile")); 
		  System.out.println(profileName);
		   }
    
 @Test(priority=16,enabled=false)
 
 public void SalesBorrowerLogin() throws Throwable
	    {
		   String  profileName=SanityPage.SalesBorrowerLogin(prop.getProperty("SEmail"),prop.getProperty("SPassword"),prop.getProperty("Salespassword"),prop.getProperty("borrowerindustry"),prop.getProperty("borroweramount"));
		   Thread.sleep(5000);
		   Assert.assertEquals(profileName, prop.getProperty("Welocome_Borrower")); 
		   System.out.println(profileName);
	     }
   
 @Test(priority=17,enabled=true)
		 
 
 public void BorrowerMyProfileFail() throws Throwable
	    {
		   Assert.assertTrue(SanityPage.BorrowerMyProfileFail(prop.getProperty("BEmail"), prop.getProperty("Bpassword")));
	     }
    
 @Test(priority=18,enabled=true)
 
 public void BorrowerMyLoansBackFail() throws Throwable
  	    {
	 Assert.assertTrue(SanityPage.BorrowerMyLoansBackFail(prop.getProperty("BEmail"), prop.getProperty("Bpassword")));
  	         }
   
 @Test(priority=19,enabled=true)
 
 public void LenderLoginAddFunds() throws Throwable
	    {
	       String profileName = SanityPage.LenderLoginAddFunds(prop.getProperty("LenderEmail"), prop.getProperty("LenderPassword"),prop.getProperty("LenderAmount"));
		   Assert.assertEquals(profileName, prop.getProperty("WelocomeFP")); 
		   System.out.println(profileName);
	          }
   
 @Test(priority=20,enabled=true)
 
 public void LenderLoginStartInvesting() throws Throwable
	    {
	        String profileName= SanityPage.LenderLoginStartInvesting(prop.getProperty("LenderEmail"), prop.getProperty("LenderPassword"),prop.getProperty("BorrowerAmount"));
		 	Thread.sleep(5000);
		    Assert.assertEquals(profileName, prop.getProperty("StartInvestmentProfile")); 
			System.out.println(profileName);
               }
    
 @Test(priority=21,enabled=true)
 
 public void LenderLoginDownloads() throws Throwable
	    {
	      String profileName= SanityPage.LenderLoginDownloads(prop.getProperty("LenderEmail"),prop.getProperty("LenderPassword"));
		  Thread.sleep(5000);
		  Assert.assertEquals(profileName, prop.getProperty("FinancepeerProfile")); 
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
	  driver.quit();
	     }
	
/* @AfterClass
  public void tearDown() 
	{
      driver.quit();
	    }*/
}
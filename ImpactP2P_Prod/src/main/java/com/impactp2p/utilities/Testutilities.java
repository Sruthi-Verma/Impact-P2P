package com.impactp2p.utilities;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.impactp2p.base.TestBase;

 public class Testutilities extends TestBase
  {
 public static String[] getMonthYear(String monthYearVal) 
     {
		return monthYearVal.split(" ");
         }

  public static  void selectDate(String exDay, String exMonth, String exYear) throws Throwable
  {
    if(exMonth.equals("February") && Integer.parseInt(exDay)>29)
	  {
		System.out.println("Wrong date: "+exMonth+" : "+exDay);
		return;
	    }
        if(Integer.parseInt(exDay)>31)
	  {
		System.out.println("Wrong date: "+exMonth+" : "+exDay);
		return;
	    }
	
 //To select month
        
	List<WebElement> list = driver.findElements(By.xpath("//*[contains(@class,'picker__select--month')]//option"));
	System.out.println(list.size());
	WebElement month = driver.findElement(By.xpath("//*[text()='"+exMonth+"']"));
	for(int i=0; i<list.size();i++)
			{
				if(list.get(i).equals(month))
				{
				  Thread.sleep(2000);
				  list.get(i).click();
				    }
			}
			Thread.sleep(3000);
			
 //To select year
			
			driver.findElement(By.xpath("//*[contains(@class,'picker__select--year')]")).click();
			List<WebElement> yearList = driver.findElements(By.xpath("//*[contains(@class,'picker__select--year')]//option"));
			System.out.println(yearList.size());
			WebElement year = driver.findElement(By.xpath("//*[text()='"+exYear+"']"));
			for(int i=0; i<yearList.size();i++)
			{
				if(yearList.get(i).equals(year))
				{
					Thread.sleep(2000);
					yearList.get(i).click();
				     }
			}
			
 //To select day
			
			List<WebElement> dayslist = driver.findElements(By.xpath("//*[contains(@class,'picker__day picker__day')]"));
			System.out.println(dayslist.size());
			WebElement day = driver.findElement(By.xpath("//*[text()='"+exDay+"']"));
			for(int i=0; i<dayslist.size();i++)
			{
				if(dayslist.get(i).equals(day))
				{
					Thread.sleep(2000);
					dayslist.get(i).click();
				  }
	
			      }
   }
  
//MinimumHoldingPeriod method dropdown code
  
   public static void Dropdown() throws Exception
     {
        driver.findElement(By.xpath("//*[@class='Rectangle-519']")).click();//full dropdown
        List<WebElement> l= driver.findElements(By.xpath("//*[text()='6 months - 12% p.a.']"));
        for(int i=0;i<l.size();i++)
         {
	        l.get(i).click(); 
	        Thread.sleep(3000);
	        
 //open dropdown for next item
	        
	       driver.findElement(By.xpath("//*[@class='css-19bqh2r']")).click();//click on dropdown//
	        Thread.sleep(3000);
             }
        
 //To close dropdown
        
            Actions a=new Actions(driver);
            a.sendKeys(Keys.ESCAPE).build().perform();
            Thread.sleep(3000);
               } 

 //LoanDetailsCommisionRecords method dropdown code
   
   public static void LoanDetailsDropdown() throws Exception
   {
      driver.findElement(By.xpath("(//*[@role='menu'])[3]")).click();//full dropdown
      List<WebElement> l= driver.findElements(By.xpath("//*[@id='Loans']/div[1]//*[text()='Active Loans']"));
      for(int i=0;i<l.size();i++)
       {
	        l.get(i).click(); 
	        Thread.sleep(3000);
	        
//open dropdown for next item
	        
	        driver.findElement(By.xpath("//*[@id='Loans']/div[1]//*[text()='Active Loans']")).click();//click on dropdown//
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[text()='Closed Loans'] ")).click();//click on dropdown//
	        Thread.sleep(3000);
             }
      
 //To close dropdown
      
      Actions a=new Actions(driver);
      a.sendKeys(Keys.ESCAPE).build().perform();
      Thread.sleep(3000);
         } 
        
      
 //Random Class
   
   public static String RandomChars(int length) 
   {
      return RandomStringUtils.random( length, "abcdefghijklmnopqrstuvwxyz");
       }
         public static String RandomIntgs(int length)
          {
            return RandomStringUtils.random( length, "9876");
            }
  
}















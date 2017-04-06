package com.automation.portal.test.functional;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.portal.generic.utils.SwitchTo;
import com.automation.portal.generic.utils.signIn;
import com.automation.portal.ui.DropDown;

public class DynamicElementsUC_001 {
	
     public static WebDriver driver;
     public static WebDriverWait wait;
     public static DropDown drpn;
     
     @BeforeTest
     public static void beforeDynamicElements()
     {
    	 InterractionPageUC_001.beforeHomePage();
 		 driver = InterractionPageUC_001.driver;
 		 drpn = new DropDown(driver);
     }
   @Test
   public static void dynamicElementsTC_001() throws Exception
   {
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		Actions act = new Actions(driver);
		act.moveToElement(drpn.dynamicElements()).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(drpn.dropdownTab())).click();
		SwitchTo.windowsAndTabs(driver, 1);
		signIn.autoSignIn(driver);
		Thread.sleep(3000);
		act.moveToElement(drpn.dynamicElements()).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(drpn.dropdownTab())).click();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(drpn.dynamicElements_frame1()));
		wait.until(ExpectedConditions.elementToBeClickable(drpn.dropdownTab_selectCountry_field1())).click();
		selectElement("Holy See (Vatican City State)");
		
   }
  // @Test
   public static void dynamicElementsTC_002() throws Exception
   {
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		Actions act = new Actions(driver);
		act.moveToElement(drpn.dynamicElements()).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(drpn.dropdownTab())).click();
		SwitchTo.windowsAndTabs(driver, 1);
		signIn.autoSignIn(driver);
		Thread.sleep(3000);
		act.moveToElement(drpn.dynamicElements()).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(drpn.dropdownTab())).click(); 
		wait.until(ExpectedConditions.elementToBeClickable(drpn.dropdownTab_enterCountry())).click(); 
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(drpn.dynamicElements_frame2()));
		wait.until(ExpectedConditions.elementToBeClickable(drpn.dropdownTab_enterCountry_field2())).clear();
		wait.until(ExpectedConditions.elementToBeClickable(drpn.dropdownTab_enterCountry_field2())).sendKeys("tanz");
		selectElement("Tanzania, United Republic of");
   }
   public static void selectElement(String name)
   {
	   Select sel = new Select(drpn.dropdownTab_selectCountry_field1());
	   
		List<WebElement>sel1 = sel.getOptions();
		
		System.out.println("total selecting elements: "+sel1.size());
		/*for(int i=0;i<sel1.size();i++)
		{
			if(sel1.get(i).getText().equalsIgnoreCase(name)){
				sel1.get(i).click();
			}
		}*/
		for(WebElement elmnt: sel1)
		{
			if(elmnt.getText().equalsIgnoreCase(name)){
				elmnt.click();
			}
		}
   }
}

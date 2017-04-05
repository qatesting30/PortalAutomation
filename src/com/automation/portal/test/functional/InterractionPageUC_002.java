package com.automation.portal.test.functional;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.portal.generic.utils.SwitchTo;
import com.automation.portal.generic.utils.signIn;
import com.automation.portal.ui.DraggablePage;
import com.automation.portal.ui.DroppablePage;

public class InterractionPageUC_002 {
	
	public static WebDriver driver;
	public static DroppablePage dp;
	public static DraggablePage drp;
	public static WebDriverWait wait;
	
	@BeforeTest
	public static void beforeDroppableTC()
	{
		InterractionPageUC_001.beforeHomePage();
		driver = InterractionPageUC_001.driver;
		dp = new DroppablePage(driver);
		drp = new DraggablePage(driver);
	}
	@Test
	public static void  DroppableTC_001() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		wait = new WebDriverWait(driver, 20);
		act.moveToElement(drp.interactionTab()).perform();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[contains(@style,'display: block')]//a[contains(text(),'Droppable')]"))).click();
		//--below code also works/--
		/*List<WebElement>ls =  driver.findElements(By.xpath("//ul[@class='dropdown']//li"));
		for(int i=0;i<ls.size();i++)
		{
		     ls.get(i).getText(); 
			}
		WebElement ele = ls.get(2);
		ele.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();	*/
		//---
		SwitchTo.windowsAndTabs(driver, 1);
		signIn.autoSignIn(driver);
		Thread.sleep(4000);
		act.moveToElement(drp.interactionTab()).perform();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[contains(@style,'display: block')]//a[contains(text(),'Droppable')]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(dp.droppable_shoppingCartDemo())).click();
        driver.switchTo().frame(dp.droppable_frame_shoppingCartDemo());
        try
        {
        	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        	if(dp.droppable_shoppingCartdemo_shirtTabExpand().isDisplayed())
        	{
        		System.out.println("tabs already selected");
        	}
        }
       catch (Exception e)
        {
    	   dp.droppable_shoppingCartdemo_shirtTabCollapse().click();
        }
        try
        {
        	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        	if(dp.droppable_shoppingCartdemo_bagsTabExpand().isDisplayed())
        	{
        		System.out.println("tabs already selected");
        	}
        }
       catch (Exception e)
        {
    	   dp.droppable_shoppingCartdemo_bagsTabCollapse().click();
        }
        try
        {
        	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        	if(dp.droppable_shoppingCartdemo_gadgetsTabExpand().isDisplayed())
        	{
        		System.out.println("tabs already selected");
        	}
        }
       catch (Exception e)
        {
    	   dp.droppable_shoppingCartdemo_gadgetsTabCollapse().click();
        }
		}

}

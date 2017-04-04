package com.automation.portal.test.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.portal.ui.DraggablePage;
import com.automation.portal.ui.DroppablePage;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class InterractionPageUC_002 {
	
	public static WebDriver driver;
	public static DroppablePage dp;
	public static DraggablePage drp;
	
	@BeforeTest
	public static void beforeDroppableTC_001()
	{
		InterractionPageUC_001.beforeHomePage();
		driver = InterractionPageUC_001.driver;
		dp = new DroppablePage(driver);
		drp = new DraggablePage(driver);
	}
	@Test
	public static void  DroppableTC_002()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.moveToElement(drp.interactionTab()).perform();
		List<WebElement>ls =  driver.findElements(By.xpath("//ul[@class='dropdown']//li"));
		System.out.println("size: "+ls.size());
		WebElement ele = ls.get(2);
		ele.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
		
		//driver.findElement(By.xpath("//div[contains(@style,'display: none')]//a[contains(text(),'Droppable')]")).click();
		
		/*Select oSelect = new Select(driver.findElement(By.className("dropdown")));
		List <WebElement> elementCount = oSelect.getOptions();
		System.out.println(elementCount.size());*/
	

		/*JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript(arg0, arg1)
		*/
		
		
		
		
		
		
		
		
		
		
		
		/*dp.interactionTab_droppable().click();
		dp.droppable_default_functionality().click();*/
		
		/*List<WebElement>ls =  driver.findElements(By.cssSelector("div[style*='none']"));
		for(int i=0;i<ls.size();i++)
		{
			System.out.println("size: "+ls.get(i).getText());
		}
		System.out.println("size: "+ls.size());
		WebElement ele = ls.get(0);
		ele.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();*/
	}

}

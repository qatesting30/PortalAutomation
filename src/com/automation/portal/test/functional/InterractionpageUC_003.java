package com.automation.portal.test.functional;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.portal.generic.utils.SwitchTo;
import com.automation.portal.generic.utils.signIn;
import com.automation.portal.ui.DraggablePage;
import com.automation.portal.ui.ResizablePage;

public class InterractionpageUC_003 {
	
	public static  WebDriver driver;
	public static WebDriverWait wait;
	public static DraggablePage drp;
	public static ResizablePage rp;
	
	@BeforeTest
	public static void beforeresizable()
	{
		InterractionPageUC_001.beforeHomePage();
		driver = InterractionPageUC_001.driver;
		drp = new DraggablePage(driver);
		rp = new ResizablePage(driver);
	}
	@Test(priority=1)
	public static void resizableTC_001() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		Actions act = new Actions(driver);
		wait = new WebDriverWait(driver, 20);
		act.moveToElement(drp.interactionTab()).perform();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[contains(@style,'display: block')]//a[contains(text(),'Resizable')]"))).click();
		SwitchTo.windowsAndTabs(driver, 1);
		signIn.autoSignIn(driver);
		Thread.sleep(4000);
		act.moveToElement(drp.interactionTab()).perform();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[contains(@style,'display: block')]//a[contains(text(),'Resizable')]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(rp.resizable_default_functionality())).click();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(rp.resizable_frame_default_functionality()));
		act.clickAndHold(rp.resizable_default_functionality_resizable_item_ht()).moveByOffset(100, 0).release().perform();
		driver.switchTo().defaultContent();
		
	}
	@Test(priority=2)
	public static void resizableTC_002() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		Actions act = new Actions(driver);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(rp.resizable_max_min())).click();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(rp.resizable_frame_max_min()));
		act.clickAndHold(rp.resizable_max_min_resizable_item_ht()).moveByOffset(100, 0).release().perform();
		act.clickAndHold(rp.resizable_max_min_resizable_item_wdt()).moveByOffset(0, 100).release().perform();
		
	}
	
}

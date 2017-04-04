package com.automation.portal.test.functional;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.portal.config.DriverConfig;
import com.automation.portal.generic.utils.SwitchTo;
import com.automation.portal.generic.utils.signIn;
import com.automation.portal.ui.DraggablePage;

public class InterractionPageUC_001 {

	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static DraggablePage hp;
	
	@BeforeTest
	public static void beforeHomePage()
	{
		driver = DriverConfig.getdriverInstance();
		hp = new DraggablePage(driver);
	}
	@Test(priority=1)
	public static void HomePageTC_001() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		Actions act = new Actions(driver);
		act.moveToElement(hp.interactionTab()).perform();
		hp.interactionTab_draggable().click();
		SwitchTo.windowsAndTabs(driver,1);
		Thread.sleep(3000);
		signIn.autoSignIn(driver);
		Thread.sleep(3000);
		act.moveToElement(hp.interactionTab()).perform();
		hp.interactionTab_draggable().click();
		
		driver.switchTo().frame(hp.interactionTab_draggable_frame_default_functionality());
		act.dragAndDropBy(hp.interactionTab_draggable_drag(), 600,100).perform();
		driver.switchTo().defaultContent();
	}
	@Test(priority=2)
	public static void HomePageTC_002()throws Exception
	{
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		hp.interactionTab_draggable_constrain_movement().click();
		Actions act = new Actions(driver);
		driver.switchTo().frame(hp.interactionTab_draggable_frame_constraint_movement());
		act.dragAndDropBy(hp.interactionTab_draggable_drag(),0, 100).perform();
		act.dragAndDropBy(hp.interactionTab_draggable_drag2(),400,0).perform();
		Thread.sleep(5000);
		act.dragAndDropBy(hp.interactionTab_draggable_drag(),0, -100).perform();
		act.dragAndDropBy(hp.interactionTab_draggable_drag3(),400,0).perform();
		act.dragAndDropBy(hp.interactionTab_draggable_drag5(),0,50).perform();
		driver.switchTo().defaultContent();
		}
	@Test(priority=3)
	public static void HomePageTC_003()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    hp.interactionTab_draggable_cursor_style().click();
		Actions act = new Actions(driver);
		driver.switchTo().frame(hp.interactionTab_draggable_frame_cursor_style());
		act.dragAndDropBy(hp.interactionTab_draggable_drag(),50, 70).perform();
		act.dragAndDropBy(hp.interactionTab_draggable_drag2(),50,70).perform();
		act.dragAndDropBy(hp.interactionTab_draggable_drag3(),-70,70).perform();
		}
	
	@AfterTest
	public static void tearDown() throws Exception{
		Thread.sleep(20000);
		driver.quit();
		//return driver;
		
	}
	
}

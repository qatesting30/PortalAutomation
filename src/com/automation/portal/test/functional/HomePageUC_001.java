package com.automation.portal.test.functional;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.portal.config.DriverConfig;
import com.automation.portal.generic.utils.SwitchTo;
import com.automation.portal.generic.utils.signIn;
import com.automation.portal.ui.HomePage;

public class HomePageUC_001 {

	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static HomePage hp;
	
	@BeforeTest
	public static void beforeHomePage()
	{
		driver = DriverConfig.getdriverInstance();
		hp = new HomePage(driver);
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
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		act.dragAndDropBy(hp.interactionTab_draggable_drag(), 600,100).perform();
		driver.switchTo().defaultContent();
	}
	@Test(priority=2)
	public static void HomePageTC_002()throws Exception
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		hp.interactionTab_draggable_constrain_movement().click();
		Actions act = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		act.dragAndDropBy(hp.interactionTab_draggable_drag(), 0, 100).perform();
	}
	
	@AfterTest
	public void tearDown() throws Exception{
		Thread.sleep(20000);
		driver.quit();
	}
	
}

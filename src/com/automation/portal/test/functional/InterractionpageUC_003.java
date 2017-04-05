package com.automation.portal.test.functional;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InterractionpageUC_003 {
	
	public static  WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeTest
	public static void beforeresizable()
	{
		InterractionPageUC_001.beforeHomePage();
		driver = InterractionPageUC_001.driver;
	}
	@Test
	public static void resizableTC_001()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
	}

}

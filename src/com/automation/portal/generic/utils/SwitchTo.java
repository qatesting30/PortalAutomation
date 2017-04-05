package com.automation.portal.generic.utils;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class SwitchTo {
	
	
	public static void windowsAndTabs(WebDriver driver,int num)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ArrayList<String>tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(num));
	}

}

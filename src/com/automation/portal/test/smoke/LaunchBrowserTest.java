package com.automation.portal.test.smoke;

import org.testng.annotations.Test;

import com.automation.portal.config.DriverConfig;

public class LaunchBrowserTest {
	
	
	@Test
	public static void lauchBrowser()
	{
		DriverConfig.getdriverInstance();
	}

}

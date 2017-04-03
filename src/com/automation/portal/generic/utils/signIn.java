package com.automation.portal.generic.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signIn {
	
	public static void autoSignIn(WebDriver driver) throws Exception
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
		Thread.sleep(3000);
		List<WebElement>hidden = driver.findElements(By.cssSelector("div[style*='block']"));
		/*for(int i=0;i<hidden.size();i++)
		{
			System.out.println("hidden elements: "+hidden.get(i).getText());
		}*/
		WebElement ele = hidden.get(1);
		ele.findElement(By.name("username")).sendKeys("qatesting30@gmail.com");
		ele.findElement(By.name("password")).sendKeys("Mobile@123");
		ele.findElement(By.className("button")).click();
	}

}

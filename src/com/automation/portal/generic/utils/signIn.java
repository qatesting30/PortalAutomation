package com.automation.portal.generic.utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signIn {
	
	public static void autoSignIn(WebDriver driver) throws Exception
	{
		WebDriverWait wait =  new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Signin')]")))).click();
		//Thread.sleep(3000);
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

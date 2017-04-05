package com.automation.portal.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResizablePage {
	
	WebDriver driver;
	
	public ResizablePage (WebDriver driver)
	{
		this.driver=driver;
	}
	

	public WebElement resizable_default_functionality()
	{
		return driver.findElement(By.xpath("//a[@href='#example-1-tab-1']"));
	}
	public WebElement resizable_max_min()
	{
		return driver.findElement(By.xpath("//a[@href='#example-1-tab-5']"));
	}
	public WebElement resizable_frame_default_functionality()
	{
		return driver.findElement(By.xpath("//iframe[@src='resizable/default.html']"));
	}
	public WebElement resizable_frame_max_min()
	{
		return driver.findElement(By.xpath("//iframe[@src='resizable/default5.html']"));
	}
	public WebElement resizable_default_functionality_resizable_item_ht()
	{
		return driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
	}
	public WebElement resizable_default_functionality_resizable_item_wdt()
	{
		return driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-s']"));
	}
	public WebElement resizable_max_min_resizable_item_ht()
	{
		return driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
	}
	public WebElement resizable_max_min_resizable_item_wdt()
	{
		return driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-s']"));
	}
	

}

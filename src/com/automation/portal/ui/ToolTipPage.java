package com.automation.portal.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolTipPage {
	
	
	WebDriver driver;
	
	public ToolTipPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement widgetTab()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Widget')]"));
	}
	public WebElement widgetTab_tooltip()
	{
		return driver.findElement(By.xpath("//ul[contains(@style,'display: block')]//a[contains(text(),'Tooltip')]"));
		                         
	}
	public WebElement widgetTab_autoComplete()
	{
		return driver.findElement(By.xpath("//ul[contains(@style,'display: block')]//a[contains(text(),'Autocomplete')]"));
		                         
	}
	public WebElement widgetTab_defaultFunctionality_tab1()
	{
		return driver.findElement(By.xpath("//a[@href='#example-1-tab-1']"));
		                         
	}
	public WebElement widgetTab_toolTip_defaultFunctionality_frame1()
	{
		return driver.findElement(By.xpath("//iframe[@src='tooltip/defult1.html']"));
	}
	public WebElement widgetTab_defaultFunctionality_tootip1()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Tooltips')]"));
	}
	public WebElement widgetTab_defaultFunctionality_tootip2()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'ThemeRoller')]"));
	}
	public WebElement widgetTab_autoComplete_defaultFunctionality_frame1()
	{
		return driver.findElement(By.xpath("//iframe[@src='autocomplete/defult1.html']"));
	}
	public WebElement widgetTab_defaultFunctionality_autoComplete1()
	{
		return driver.findElement(By.id("tags"));
	}

}

package com.automation.portal.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDown {
	
	WebDriver driver;
	
    public DropDown(WebDriver driver)
	{
		this.driver=driver;
	}
    public WebElement dynamicElements()
    {
    	return driver.findElement(By.xpath("//a[contains(text(),'Dynamic Elements')]"));
    }
    public WebElement dropdownTab_selectCountry()
    {
    	return driver.findElement(By.xpath("//a[@href='#example-1-tab-1']"));
     }
    public WebElement dropdownTab_enterCountry()
    {
    	return driver.findElement(By.xpath("//a[@href='#example-1-tab-2']"));
     }
    public WebElement dynamicElements_frame1()
    {
    	return driver.findElement(By.xpath("//iframe[@src='dropdown/default.html']"));
    }
    public WebElement dynamicElements_frame2()
    {
    	return driver.findElement(By.xpath("//iframe[@src='dropdown/default1.html']"));
    }
    public WebElement dropdownTab()
    {
    	return driver.findElement(By.xpath("//ul[contains(@style,'display: block')]//a[contains(text(),'Dropdown')]"));
     }
    public WebElement dropdownTab_selectCountry_field1()
    {
    	return driver.findElement(By.xpath("//html//body//select"));
     }
    public WebElement dropdownTab_enterCountry_field2()
    {
    	return driver.findElement(By.xpath("//input[@class='custom-combobox-input ui-widget ui-widget-content ui-state-default ui-corner-left ui-autocomplete-input']"));
     }
   

}

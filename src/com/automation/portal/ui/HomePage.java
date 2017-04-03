package com.automation.portal.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	public  HomePage (WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement interactionTab()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Interaction')]"));
	}
	public WebElement interactionTab_draggable_default_functionality()
	{
		return driver.findElement(By.xpath("//a[@href='#example-1-tab-1']"));
	}
	public WebElement interactionTab_draggable_constrain_movement()
	{
		return driver.findElement(By.xpath("//a[@href='#example-1-tab-2']"));
	}
	public WebElement interactionTab_draggable_cursor_style()
	{
		return driver.findElement(By.xpath("//a[@href='#example-1-tab-3']"));
	}
	public WebElement interactionTab_draggable_events()
	{
		return driver.findElement(By.xpath("//a[@href='#example-1-tab-3']"));
	}
	public WebElement interactionTab_draggable_draggable_sortable()
	{
		return driver.findElement(By.xpath("//a[@href='#example-1-tab-3']"));
	}

	public WebElement interactionTab_draggable()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Draggable')]"));
	}
	public WebElement interactionTab_draggable_drag()
	{
		return driver.findElement(By.id("draggable"));
	}
	
}

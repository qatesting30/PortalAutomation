package com.automation.portal.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DraggablePage {
	
	WebDriver driver;
	
	public  DraggablePage (WebDriver driver)
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
		return driver.findElement(By.xpath("//a[@href='#example-1-tab-4']"));
	}
	public WebElement interactionTab_draggable_draggable_sortable()
	{
		return driver.findElement(By.xpath("//a[@href='#example-1-tab-5']"));
	}

	public WebElement interactionTab_draggable()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Draggable')]"));
	}
	public WebElement interactionTab_draggable_drag()
	{
		return driver.findElement(By.id("draggable"));
	}
	public WebElement interactionTab_draggable_drag2()
	{
		return driver.findElement(By.id("draggable2"));
	}
	public WebElement interactionTab_draggable_drag3()
	{
		return driver.findElement(By.id("draggable3"));
	}
	public WebElement interactionTab_draggable_drag5()
	{
		return driver.findElement(By.id("draggable5"));
	}
	public WebElement interactionTab_draggable_frame_default_functionality()
	{
		return driver.findElement(By.xpath("//iframe[@src='draggable/default.html']"));
	}
	public WebElement interactionTab_draggable_frame_constraint_movement()
	{
		return driver.findElement(By.xpath("//iframe[@src='draggable/default2.html']"));
	}
	public WebElement interactionTab_draggable_frame_cursor_style()
	{
		return driver.findElement(By.xpath("//iframe[@src='draggable/default3.html']"));
	}
	public WebElement interactionTab_draggable_frame_events()
	{
		return driver.findElement(By.xpath("//iframe[@src='draggable/default4.html']"));
	}
	public WebElement interactionTab_draggable_frame_draggable_sortable()
	{
		return driver.findElement(By.xpath("//iframe[@src='draggable/default5.html']"));
	}
	
}

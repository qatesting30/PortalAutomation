package com.automation.portal.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DroppablePage {
	
	WebDriver driver;
	
	public DroppablePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement interactionTab_droppable()
	{
		//return driver.findElement(By.xpath("//a[contains(text(),'Droppable')]"));
		return driver.findElement(By.xpath("//a[@href='droppable.php']"));
	}
    public WebElement droppable_default_functionality()
{
	return driver.findElement(By.xpath("//a[@href = '#example-1-tab-1']"));
}
    public WebElement droppable_default_draggable()
{
	return driver.findElement(By.id("draggable"));
}

}

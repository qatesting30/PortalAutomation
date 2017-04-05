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
		return driver.findElement(By.xpath("//a[contains(text(),'Droppable')]"));
		//return driver.findElement(By.xpath("//a[@href='droppable.php']"));
	}
    public WebElement droppable_default_functionality()
{
	return driver.findElement(By.xpath("//a[@href = '#example-1-tab-1']"));
}
    public WebElement droppable_frame_shoppingCartDemo()
    {
    	return driver.findElement(By.xpath("//iframe[@src = 'droppable/default5.html']"));
    }

    public WebElement droppable_shoppingCartDemo()
    {
    	return driver.findElement(By.xpath("//a[@href = '#example-1-tab-5']"));
    }
    public WebElement droppable_shoppingCartdemo_shirtTabExpand()
    {
    	return driver.findElement(By.xpath("//h2[@aria-expanded='true' and @id = 'ui-id-1']"));
    }
    public WebElement droppable_shoppingCartdemo_shirtTabCollapse()
    {
    	return driver.findElement(By.xpath("//h2[@aria-expanded='false' and @id ='ui-id-1']"));
    }
    public WebElement droppable_shoppingCartdemo_bagsTabExpand()
    {
    	return driver.findElement(By.xpath("//h2[@aria-expanded='true' and @id = 'ui-id-3']"));
    }
    public WebElement droppable_shoppingCartdemo_bagsTabCollapse()
    {
    	return driver.findElement(By.xpath("//h2[@aria-expanded='false' and @id = 'ui-id-3']"));
    }
    public WebElement droppable_shoppingCartdemo_gadgetsTabExpand()
    {
    	return driver.findElement(By.xpath("//h2[@aria-expanded='true' and @id = 'ui-id-5']"));
    }
    public WebElement droppable_shoppingCartdemo_gadgetsTabCollapse()
    {
    	return driver.findElement(By.xpath("//h2[@aria-expanded='false' and @id = 'ui-id-5']"));
    }

}

package com.automation.portal.test.functional;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.portal.generic.utils.SwitchTo;
import com.automation.portal.generic.utils.signIn;
import com.automation.portal.ui.DraggablePage;
import com.automation.portal.ui.ToolTipPage;

public class WidgetpageUC_001 {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static DraggablePage drag;
	public static ToolTipPage tp;
	
	@BeforeTest
	public static void beforeToolTip()
	{
		InterractionPageUC_001.beforeHomePage();
		driver = InterractionPageUC_001.driver;
		drag = new DraggablePage(driver);
		tp = new ToolTipPage(driver);
	}
	//@Test
	public static void toolTipTC_001()throws Exception
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		Actions act = new Actions(driver);
		act.moveToElement(tp.widgetTab()).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(tp.widgetTab_tooltip())).click();
		SwitchTo.windowsAndTabs(driver, 1);
		signIn.autoSignIn(driver);
		Thread.sleep(4000);
		act.moveToElement(tp.widgetTab()).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(tp.widgetTab_tooltip())).click();
		wait.until(ExpectedConditions.elementToBeClickable(tp.widgetTab_defaultFunctionality_tab1())).click();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(tp.widgetTab_toolTip_defaultFunctionality_frame1()));
		wait.until(ExpectedConditions.visibilityOf(tp.widgetTab_defaultFunctionality_tootip2())).isDisplayed();
		/*act.moveToElement(tp.widgetTab_tooltip_defaultFunctionality_tootip2()).build().perform();
		act.moveToElement(tp.widgetTab_tooltip_defaultFunctionality_tootip1()).build().perform();*/
		WebElement ele2 = tp.widgetTab_defaultFunctionality_tootip2();
		System.out.println("tooltip1 title :"+ele2.getAttribute("title"));
		WebElement ele1 = tp.widgetTab_defaultFunctionality_tootip1();
		System.out.println("tooltip2 title :"+ele1.getAttribute("title"));
		driver.switchTo().defaultContent();
	}
	@Test
	public static void autoCompleteTC_001() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		Actions act = new Actions(driver);
		act.moveToElement(tp.widgetTab()).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(tp.widgetTab_autoComplete())).click();
		SwitchTo.windowsAndTabs(driver, 1);
		signIn.autoSignIn(driver);
		Thread.sleep(4000);
		act.moveToElement(tp.widgetTab()).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(tp.widgetTab_autoComplete())).click();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(tp.widgetTab_autoComplete_defaultFunctionality_frame1()));
		wait.until(ExpectedConditions.elementToBeClickable(tp.widgetTab_defaultFunctionality_autoComplete1())).sendKeys("j");
		autoCompletegetoptuionList("JavaScript");
	
		
		
	}
	public static void autoCompletegetoptuionList(String option)
	{
		WebElement el = driver.findElement(By.id("ui-id-1"));
		wait.until(ExpectedConditions.visibilityOf(el));
		List<WebElement>listOfOptions = driver.findElements(By.tagName("li"));
		
		for(WebElement opt : listOfOptions)
		{
			if(opt.getText().contains(option))
			{
				opt.click();
			}
		}
	}

}
